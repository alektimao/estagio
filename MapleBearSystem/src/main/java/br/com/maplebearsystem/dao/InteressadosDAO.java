package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

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

	public List<Interessados> listInteressados(String filter) {
		List<Interessados> list;

		String jpqlQuery = "select r from Interessados r where lower(r.nome) LIKE :pInteressadosnome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Interessados> query = em.createQuery(jpqlQuery, Interessados.class);
		query.setParameter("pInteressadosnome", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
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
