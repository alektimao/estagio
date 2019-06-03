package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.PedidoFunc;
import br.com.maplebearsystem.persistance.JPAUtil;

public class PedidoFuncDAO extends GenericDAO<PedidoFunc> {

	public PedidoFuncDAO() {
		super(PedidoFunc.class);
	}

	public List<PedidoFunc> listAllEstoque() {

		List<PedidoFunc> list;

		String jpqlQuery = "select r from PedidoFunc r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PedidoFunc> query = em.createQuery(jpqlQuery, PedidoFunc.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<PedidoFunc> listEstoque(Product produto) {
		List<PedidoFunc> list;

		String jpqlQuery = "select r from PedidoFunc r where r.produto = :pProduto";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PedidoFunc> query = em.createQuery(jpqlQuery, PedidoFunc.class);
		query.setParameter("pProduto", produto);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(PedidoFunc obj) {
		return obj.getId();
	}

	public List<PedidoFunc> listAllPedidoFunc() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PedidoFunc> listAllPedidos() {
		List<PedidoFunc> list;

		String jpqlQuery = "select r from PedidoFunc r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PedidoFunc> query = em.createQuery(jpqlQuery, PedidoFunc.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<PedidoFunc> listPedidos(String filter) {
		List<PedidoFunc> list;

		String jpqlQuery = "select r from PedidoFunc r where lower(r.descricao) LIKE :pDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PedidoFunc> query = em.createQuery(jpqlQuery, PedidoFunc.class);
		query.setParameter("pDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
}
