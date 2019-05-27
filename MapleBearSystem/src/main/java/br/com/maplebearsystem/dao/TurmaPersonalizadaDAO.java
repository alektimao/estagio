package br.com.maplebearsystem.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.persistance.JPAUtil;

public class TurmaPersonalizadaDAO extends GenericDAO<TurmaPersonalizada> {

	public TurmaPersonalizadaDAO() {
		super(TurmaPersonalizada.class);
	}
	
	public List<TurmaPersonalizada> listAllTurmaPersonalizada() {

		List<TurmaPersonalizada> list;

		String jpqlQuery = "select r from TurmaPersonalizada r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<TurmaPersonalizada> query = em.createQuery(jpqlQuery, TurmaPersonalizada.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<TurmaPersonalizada> listApprovedBudgetOrders(String nometurma,String responsavel) {

		Root<TurmaPersonalizada> TurmaPersonalizadaRoot;

		List<TurmaPersonalizada> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<TurmaPersonalizada> criteriaQuery = criteriaBuilder.createQuery(TurmaPersonalizada.class);

		TurmaPersonalizadaRoot = criteriaQuery.from(TurmaPersonalizada.class);
		if ((nometurma != null || !nometurma.equals("")) && (responsavel != null || !responsavel.equals(""))) {
			Predicate pEqualsTurma = criteriaBuilder.equal(TurmaPersonalizadaRoot.get("nometurma"), nometurma);			
			Predicate pEqualsresponsavel = criteriaBuilder.equal(TurmaPersonalizadaRoot.get("responsavel"), responsavel);
			
			Predicate filtros = criteriaBuilder.and(pEqualsTurma,pEqualsresponsavel);
			
			criteriaQuery.select(TurmaPersonalizadaRoot).where(filtros).orderBy(criteriaBuilder.asc(TurmaPersonalizadaRoot.get("id")));
		}
		if ((nometurma != null || !nometurma.equals("")) && (responsavel == null || responsavel.equals(""))) {
			Predicate pEqualsTurma = criteriaBuilder.equal(TurmaPersonalizadaRoot.get("nometurma"), nometurma);			
		
			criteriaQuery.select(TurmaPersonalizadaRoot).where(pEqualsTurma).orderBy(criteriaBuilder.asc(TurmaPersonalizadaRoot.get("id")));
		}
		if ((nometurma == null || nometurma.equals("")) && (responsavel != null || !responsavel.equals(""))) {			
			Predicate pEqualsresponsavel = criteriaBuilder.equal(TurmaPersonalizadaRoot.get("responsavel"), responsavel);
			
			criteriaQuery.select(TurmaPersonalizadaRoot).where(pEqualsresponsavel).orderBy(criteriaBuilder.asc(TurmaPersonalizadaRoot.get("id")));
		}

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}
	
	public List<TurmaPersonalizada> listTurmaPersonalizada(String filter) {
		List<TurmaPersonalizada> list;

		String jpqlQuery = "select r from TurmaPersonalizada r where lower(r.nometurma) LIKE :pTurmaPersonalizadaDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<TurmaPersonalizada> query = em.createQuery(jpqlQuery, TurmaPersonalizada.class);
		query.setParameter("pTurmaPersonalizadaDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(TurmaPersonalizada obj) {
		return obj.getId();
	}

	public void save(List<TurmaPersonalizada> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (TurmaPersonalizada product : obj) {
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
