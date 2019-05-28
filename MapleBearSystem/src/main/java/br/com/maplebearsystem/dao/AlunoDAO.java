package br.com.maplebearsystem.dao;

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
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.persistance.JPAUtil;

public class AlunoDAO extends GenericDAO<Aluno> {

	public AlunoDAO() {
		super(Aluno.class);
	}

//	@Override
//	public Aluno save(Aluno obj) {
//
//		String jpqlQuery = "select r from Aluno r where r.idalunowebservice =  :pDescription";
//		EntityManager em = JPAUtil.getEntityManager();
//		em.getTransaction().begin();
//		TypedQuery<Aluno> query = em.createQuery(jpqlQuery, Aluno.class);
//		query.setParameter("pDescription", obj.getIdalunowebservice());
//
//		try {
//			Aluno result = query.getSingleResult();
//
//			em.getTransaction().commit();
//
//			// check if is not the same object
//			if (!result.getId().equals(obj.getId())) {
//				throw new EntityExistsException("Error: Aluno with the same description already exists");
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

	public List<Aluno> listAllAluno() {

		List<Aluno> list;

		String jpqlQuery = "select r from Aluno r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Aluno> query = em.createQuery(jpqlQuery, Aluno.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Aluno> listAluno(String filter) {
		List<Aluno> list;

		String jpqlQuery = "select r from Aluno r where lower(r.nome) LIKE :pAlunoDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Aluno> query = em.createQuery(jpqlQuery, Aluno.class);
		query.setParameter("pAlunoDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public Aluno listAlunoId(Integer filter) {
		Aluno list;

		String jpqlQuery = "select r from Aluno r where r.idalunowebservice = :pAluno";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Aluno> query = em.createQuery(jpqlQuery, Aluno.class);
		query.setParameter("pAluno",filter);
		list = query.getSingleResult();

		em.getTransaction().commit();

		return list;
	}
	public List<Aluno> listAlunosBusca(String cpf,String nometurma,String numeromatricula) {

		Root<Aluno> AlunoRoot;

		List<Aluno> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<Aluno> criteriaQuery = criteriaBuilder.createQuery(Aluno.class);

		AlunoRoot = criteriaQuery.from(Aluno.class);
		
		List<Predicate> filtros = new ArrayList<Predicate>();
		
		if (nometurma != null || !nometurma.equals("")) {
			Predicate pEqualsTurma = criteriaBuilder.equal(AlunoRoot.get("nome"), nometurma);
			filtros.add(pEqualsTurma);
		}
		if (cpf != null || !cpf.equals("")) {
			Predicate pEqualscpf = criteriaBuilder.equal(AlunoRoot.get("cpf"), cpf);
			filtros.add(pEqualscpf);
		}
		
		if (numeromatricula != null || !numeromatricula.equals("")) {
			Predicate pEqualsnumeromatricula = criteriaBuilder.equal(AlunoRoot.get("numeromatricula"), numeromatricula);			
			filtros.add(pEqualsnumeromatricula);
		}
		
		//Predicate filtros2 = criteriaBuilder.any(filtros.toArray());
		
	    criteriaQuery.select(AlunoRoot).where(filtros.toArray(new Predicate[] {})).orderBy(criteriaBuilder.asc(AlunoRoot.get("id")));

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}

	@Override
	public Long getID(Aluno obj) {
		return obj.getId();
	}

	public void save(List<Aluno> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (Aluno product : obj) {
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
