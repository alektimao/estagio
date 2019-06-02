package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.maplebearsystem.model.Restricao;
import br.com.maplebearsystem.persistance.JPAUtil;

public class RestricaoDAO extends GenericDAO<Restricao> {

	public RestricaoDAO() {
		super(Restricao.class);
	}
	
	public List<Restricao> listAllRestricao() {

		List<Restricao> list;

		String jpqlQuery = "select r from Restricao r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Restricao> query = em.createQuery(jpqlQuery, Restricao.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<Restricao> listApprovedBudgetOrders(String documento,String nomealuno) {

		Root<Restricao> RestricaoRoot;

		List<Restricao> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<Restricao> criteriaQuery = criteriaBuilder.createQuery(Restricao.class);

		RestricaoRoot = criteriaQuery.from(Restricao.class);

		Predicate pEqualsResponsavel1 = criteriaBuilder.equal(RestricaoRoot.get("documento"), documento);
		
		Predicate pEqualsAluno = criteriaBuilder.equal(RestricaoRoot.get("Aluno").get("nome"), nomealuno);

		Predicate filtros = criteriaBuilder.and(pEqualsResponsavel1, pEqualsAluno);

		criteriaQuery.select(RestricaoRoot).where(filtros).orderBy(criteriaBuilder.asc(RestricaoRoot.get("id")));

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}
	
	public List<Restricao> listRestricao(String filter) {
		List<Restricao> list;

		String jpqlQuery = "select r from Restricao r where lower(r.documento) LIKE :pRestricaoDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Restricao> query = em.createQuery(jpqlQuery, Restricao.class);
		query.setParameter("pRestricaoDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Restricao obj) {
		return obj.getId();
	}

	public void save(List<Restricao> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (Restricao product : obj) {
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

	public List<Restricao> listRestricao(Long id) {
		List<Restricao> list;

		String jpqlQuery = "select r from Restricao r where r.aluno.id = :pId";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Restricao> query = em.createQuery(jpqlQuery, Restricao.class);
		query.setParameter("pId",id);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

}
