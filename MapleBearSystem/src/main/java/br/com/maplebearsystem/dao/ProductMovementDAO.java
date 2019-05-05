package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Estoque;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.persistance.JPAUtil;

public class ProductMovementDAO extends GenericDAO<ProductMovement> {

	public ProductMovementDAO() {
		super(ProductMovement.class);
	}

	public List<ProductMovement> listAllProductMovement() {

		List<ProductMovement> list;

		String jpqlQuery = "select r from ProductMovement r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<ProductMovement> query = em.createQuery(jpqlQuery, ProductMovement.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<ProductMovement> listEstoque(ProductMovement produto) {
		List<ProductMovement> list;

		String jpqlQuery = "select r from ProductMovement r where r.produto = :pProduto";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<ProductMovement> query = em.createQuery(jpqlQuery, ProductMovement.class);
		query.setParameter("pProduto",produto.getProduto());
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(ProductMovement obj) {
		return obj.getId();
	}
}
