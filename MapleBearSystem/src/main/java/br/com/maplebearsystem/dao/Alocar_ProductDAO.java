package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Alocar_Produto;
import br.com.maplebearsystem.persistance.JPAUtil;

public class Alocar_ProductDAO extends GenericDAO<Alocar_Produto> {

	public Alocar_ProductDAO() {
		super(Alocar_Produto.class);
	}
	
	public List<Alocar_Produto> listAllProduct() {

		List<Alocar_Produto> list;

		String jpqlQuery = "select r from Alocar_Produto r ORDER BY r.produtos.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Alocar_Produto> query = em.createQuery(jpqlQuery, Alocar_Produto.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Alocar_Produto> listProdutosPedidos(long idrequisicao) {
		List<Alocar_Produto> list;

		String jpqlQuery = "select r from Alocar_Produto r where r.produtos.id = :pId";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Alocar_Produto> query = em.createQuery(jpqlQuery, Alocar_Produto.class);
		query.setParameter("pId",idrequisicao);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Alocar_Produto obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
