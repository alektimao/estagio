package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Federation;
import br.com.maplebearsystem.persistance.JPAUtil;


public class FederationDAO extends GenericDAO<Federation> {

	public FederationDAO() {
		super(Federation.class);
	}

	@Override
	public Long getID(Federation obj) {
		return obj.getId();
	}

	public List<Federation> getFederationByName(String filter) {
		List<Federation> list;

		String jpqlQuery = "select r from Federation r where lower(r.name) = :pNome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Federation> query = em.createQuery(jpqlQuery, Federation.class);
		query.setParameter("pNome", filter.toLowerCase());
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

}
