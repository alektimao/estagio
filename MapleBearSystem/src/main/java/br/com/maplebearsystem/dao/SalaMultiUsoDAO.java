package br.com.maplebearsystem.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.maplebearsystem.model.SalaMultiUso;
import br.com.maplebearsystem.persistance.JPAUtil;

public class SalaMultiUsoDAO extends GenericDAO<SalaMultiUso> {

	public SalaMultiUsoDAO() {
		super(SalaMultiUso.class);
	}
	
	public List<SalaMultiUso> listAllSalaMultiUso() {

		List<SalaMultiUso> list;

		String jpqlQuery = "select r from SalaMultiUso r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<SalaMultiUso> query = em.createQuery(jpqlQuery, SalaMultiUso.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<SalaMultiUso> listApprovedBudgetOrders(String nometurma,String responsavel) {

		Root<SalaMultiUso> SalaMultiUsoRoot;

		List<SalaMultiUso> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<SalaMultiUso> criteriaQuery = criteriaBuilder.createQuery(SalaMultiUso.class);

		SalaMultiUsoRoot = criteriaQuery.from(SalaMultiUso.class);
		if ((nometurma != null || !nometurma.equals("")) && (responsavel != null || !responsavel.equals(""))) {
			Predicate pEqualsTurma = criteriaBuilder.equal(SalaMultiUsoRoot.get("nomeatividade"), nometurma);			
			Predicate pEqualsresponsavel = criteriaBuilder.equal(SalaMultiUsoRoot.get("responsavelativade"), responsavel);
			
			Predicate filtros = criteriaBuilder.and(pEqualsTurma,pEqualsresponsavel);
			
			criteriaQuery.select(SalaMultiUsoRoot).where(filtros).orderBy(criteriaBuilder.asc(SalaMultiUsoRoot.get("id")));
		}
		if ((nometurma != null || !nometurma.equals("")) && (responsavel == null || responsavel.equals(""))) {
			Predicate pEqualsTurma = criteriaBuilder.equal(SalaMultiUsoRoot.get("nomeatividade"), nometurma);			
		
			criteriaQuery.select(SalaMultiUsoRoot).where(pEqualsTurma).orderBy(criteriaBuilder.asc(SalaMultiUsoRoot.get("id")));
		}
		if ((nometurma == null || nometurma.equals("")) && (responsavel != null || !responsavel.equals(""))) {			
			Predicate pEqualsresponsavel = criteriaBuilder.equal(SalaMultiUsoRoot.get("responsavelativade"), responsavel);
			
			criteriaQuery.select(SalaMultiUsoRoot).where(pEqualsresponsavel).orderBy(criteriaBuilder.asc(SalaMultiUsoRoot.get("id")));
		}

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}
	
	public List<SalaMultiUso> listSalaMultiUso(String filter) {
		List<SalaMultiUso> list;

		String jpqlQuery = "select r from SalaMultiUso r where lower(r.nomeatividade) LIKE :pSalaMultiUsoDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<SalaMultiUso> query = em.createQuery(jpqlQuery, SalaMultiUso.class);
		query.setParameter("pSalaMultiUsoDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(SalaMultiUso obj) {
		return obj.getId();
	}

	public void save(List<SalaMultiUso> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (SalaMultiUso product : obj) {
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
