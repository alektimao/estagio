package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.persistance.JPAUtil;

public class AlocarDAO extends GenericDAO<Alocar> {

	public AlocarDAO() {
		super(Alocar.class);
	}

	public List<Alocar> listAllEstoque() {

		List<Alocar> list;

		String jpqlQuery = "select r from Alocar r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Alocar> query = em.createQuery(jpqlQuery, Alocar.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Alocar> listEstoque(Product produto) {
		List<Alocar> list;

		String jpqlQuery = "select r from Alocar r where r.produto = :pProduto";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Alocar> query = em.createQuery(jpqlQuery, Alocar.class);
		query.setParameter("pProduto", produto);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Alocar obj) {
		return obj.getId();
	}
	
	public List<Alocar> listAllAlocar() {
		List<Alocar> list;

		String jpqlQuery = "select r from Alocar r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Alocar> query = em.createQuery(jpqlQuery, Alocar.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Alocar> listAlocar(String filter) {
		List<Alocar> list;

		String jpqlQuery = "select r from Alocar r where lower(r.funcionario.pessoa.name) LIKE :pDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Alocar> query = em.createQuery(jpqlQuery, Alocar.class);
		query.setParameter("pDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
}
