package br.com.maplebearsystem.dao;

import java.sql.Date;
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

import br.com.maplebearsystem.model.Contrato;
import br.com.maplebearsystem.persistance.JPAUtil;

public class ContratoDAO extends GenericDAO<Contrato> {

	public ContratoDAO() {
		super(Contrato.class);
	}
	
	public List<Contrato> listAllContrato() {

		List<Contrato> list;

		String jpqlQuery = "select r from Contrato r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Contrato> query = em.createQuery(jpqlQuery, Contrato.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<Contrato> listApprovedBudgetOrders(String responsavel,String responsavel2,String Aluno) {

		Root<Contrato> ContratoRoot;

		List<Contrato> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<Contrato> criteriaQuery = criteriaBuilder.createQuery(Contrato.class);

		ContratoRoot = criteriaQuery.from(Contrato.class);

		Predicate pEqualsResponsavel1 = criteriaBuilder.equal(ContratoRoot.get("Responsavel"), responsavel);
		
		Predicate pEqualsResponsavel2 = criteriaBuilder.equal(ContratoRoot.get("Responsavel2"), responsavel2);
		
		Predicate pEqualsAluno = criteriaBuilder.equal(ContratoRoot.get("Aluno"), responsavel2);

		Predicate filtros = criteriaBuilder.and(pEqualsResponsavel1, pEqualsResponsavel2,pEqualsAluno);

		criteriaQuery.select(ContratoRoot).where(filtros).orderBy(criteriaBuilder.asc(ContratoRoot.get("id")));

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}
	
	public List<Contrato> listContrato(String filter) {
		List<Contrato> list;

		String jpqlQuery = "select r from Contrato r where lower(r.Responsavel) LIKE :pContratoDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Contrato> query = em.createQuery(jpqlQuery, Contrato.class);
		query.setParameter("pContratoDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Contrato obj) {
		return obj.getId();
	}

	public void save(List<Contrato> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (Contrato product : obj) {
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
