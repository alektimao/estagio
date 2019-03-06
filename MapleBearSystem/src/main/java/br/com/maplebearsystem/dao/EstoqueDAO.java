package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Estoque;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.persistance.JPAUtil;

public class EstoqueDAO extends GenericDAO<Estoque> {

	public EstoqueDAO() {
		super(Estoque.class);
	}

	public List<Estoque> listAllEstoque() {

		List<Estoque> list;

		String jpqlQuery = "select r from Estoque r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Estoque> query = em.createQuery(jpqlQuery, Estoque.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Estoque> listEstoque(Product produto) {
		List<Estoque> list;

		String jpqlQuery = "select r from Estoque r where r.produto = :pProduto";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Estoque> query = em.createQuery(jpqlQuery, Estoque.class);
		query.setParameter("pProduto",produto);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Estoque obj) {
		return obj.getId();
	}

	public void save(List<Estoque> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (Estoque product : obj) {
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
