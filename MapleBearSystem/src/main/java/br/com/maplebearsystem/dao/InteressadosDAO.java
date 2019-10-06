package br.com.maplebearsystem.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Interessados;
import br.com.maplebearsystem.persistance.JPAUtil;

public class InteressadosDAO extends GenericDAO<Interessados> {

	public InteressadosDAO() {
		super(Interessados.class);
	}

//	@Override
//	public Product save(Product obj) {
//
//		String jpqlQuery = "select r from Product r where lower(r.shortDescription) =  :pDescription";
//		EntityManager em = JPAUtil.getEntityManager();
//		em.getTransaction().begin();
//		TypedQuery<Product> query = em.createQuery(jpqlQuery, Product.class);
//		query.setParameter("pDescription", obj.getShortDescription().toLowerCase());
//
//		try {
//			Product result = query.getSingleResult();
//
//			em.getTransaction().commit();
//
//			// check if is not the same object
//			if (!result.getId().equals(obj.getId())) {
//				throw new EntityExistsException("Error: Product with the same description already exists");
//			}
//
//			return super.save(obj);
//		} catch (NoResultException e) {
//			// Save when query has no result
//			return super.save(obj);
//		} catch (EntityExistsException e) {
//
//			throw e;
//
//		} catch (EntityNotFoundException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			em.close();
//		}
//
//		return null;
//
//	}

	public List<Interessados> listAllInteressados() {

		List<Interessados> list;

		String jpqlQuery = "select r from Interessados r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Interessados> query = em.createQuery(jpqlQuery, Interessados.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Interessados> listInteressados(String filter, LocalDate localDate, LocalDate localDate2) {
		Root<Interessados> Root;

		List<Interessados> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<Interessados> criteriaQuery = criteriaBuilder.createQuery(Interessados.class);

		Root = criteriaQuery.from(Interessados.class);
		
		List<Predicate> filtros = new ArrayList<Predicate>();
		
		if (filter != null && !filter.equals("")) {
			Predicate pnome = criteriaBuilder.equal(criteriaBuilder.lower(Root.get("nome")), filter);
			filtros.add(pnome);
		}
		if (localDate != null && localDate2 == null) {
			Predicate start = criteriaBuilder.greaterThanOrEqualTo(Root.get("data"), Date.valueOf(localDate));
			Predicate end = criteriaBuilder.lessThanOrEqualTo(Root.get("data"), Date.valueOf(localDate));
			filtros.add(start);
			filtros.add(end);
		}	
		if (localDate != null && localDate2 != null) {
			Predicate start = criteriaBuilder.greaterThanOrEqualTo(Root.get("data"), Date.valueOf(localDate));
			Predicate end = criteriaBuilder.lessThanOrEqualTo(Root.get("data"), Date.valueOf(localDate2));			
			filtros.add(start);
			filtros.add(end);
		}
	    criteriaQuery.select(Root).where(filtros.toArray(new Predicate[] {})).orderBy(criteriaBuilder.asc(Root.get("id")));

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
		//List<Interessados> list;

//		String jpqlQuery = "select r from Interessados r where lower(r.nome) LIKE :pInteressadosnome";
//
//		EntityManager em = JPAUtil.getEntityManager();
//
//		em.getTransaction().begin();
//
//		TypedQuery<Interessados> query = em.createQuery(jpqlQuery, Interessados.class);
//		query.setParameter("pInteressadosnome", "%" + filter.toLowerCase() + "%");
//		list = query.getResultList();
//
//		em.getTransaction().commit();
//
//		return list;
	}

	@Override
	public Long getID(Interessados obj) {
		return obj.getId();
	}

	public void save(List<Interessados> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (Interessados product : obj) {
				if (product.getId() == null) {
					em.persist(product);
				} else {
					em.merge(product);
				}
			}
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			throw ex;
		} finally {
			em.close();
		}
	}

}
