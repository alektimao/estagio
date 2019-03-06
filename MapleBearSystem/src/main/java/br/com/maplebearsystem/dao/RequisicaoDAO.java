package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.persistance.JPAUtil;

public class RequisicaoDAO extends GenericDAO<Requisicao> {

	public RequisicaoDAO() {
		super(Requisicao.class);
	}

	public List<Requisicao> listAllEstoque() {

		List<Requisicao> list;

		String jpqlQuery = "select r from Requisicao r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Requisicao> query = em.createQuery(jpqlQuery, Requisicao.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Requisicao> listEstoque(Product produto) {
		List<Requisicao> list;

		String jpqlQuery = "select r from Requisicao r where r.produto = :pProduto";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Requisicao> query = em.createQuery(jpqlQuery, Requisicao.class);
		query.setParameter("pProduto", produto);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Requisicao obj) {
		return obj.getId();
	}

	public List<Requisicao> listAllRequisicao() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Requisicao> listAllPedidos() {
		List<Requisicao> list;

		String jpqlQuery = "select r from Requisicao r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Requisicao> query = em.createQuery(jpqlQuery, Requisicao.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Requisicao> listPedidos(String filter) {
		List<Requisicao> list;

		String jpqlQuery = "select r from Requisicao r where lower(r.descricao) LIKE :pDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Requisicao> query = em.createQuery(jpqlQuery, Requisicao.class);
		query.setParameter("pDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
}
