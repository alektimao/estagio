package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.PedidoFunc;
import br.com.maplebearsystem.model.PedidoFunc_Produto;
import br.com.maplebearsystem.persistance.JPAUtil;

public class PedidoFunc_ProductDAO extends GenericDAO<PedidoFunc_Produto> {

	public PedidoFunc_ProductDAO() {
		super(PedidoFunc_Produto.class);
	}
	
	public List<PedidoFunc_Produto> listAllProduct() {

		List<PedidoFunc_Produto> list;

		String jpqlQuery = "select r from PedidoFunc_Produto r ORDER BY r.requisicao.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PedidoFunc_Produto> query = em.createQuery(jpqlQuery, PedidoFunc_Produto.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<PedidoFunc_Produto> listProdutosPedidos(long idrequisicao) {
		List<PedidoFunc_Produto> list;

		String jpqlQuery = "select r from PedidoFunc_Produto r where r.requisicao.id = :pId";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PedidoFunc_Produto> query = em.createQuery(jpqlQuery, PedidoFunc_Produto.class);
		query.setParameter("pId",idrequisicao);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

//	@Override
//	public Long getID(FornecedorProduct obj) {
//		return obj.getId();
//	}

//	public void save(List<FornecedorProduct> obj) {
//
//		EntityManager em = JPAUtil.getEntityManager();
//
//		try {
//			em.getTransaction().begin();
//			for (FornecedorProduct product : obj) {
//				if (product.getId() == null) {
//					em.persist(product);
//				} else {
//					em.merge(product);
//				}
//			}
//			em.getTransaction().commit();
//		} catch (Exception ex) {
//			em.getTransaction().rollback();
//			throw ex;
//		} finally {
//			em.close();
//		}
//	}

	@Override
	public Long getID(PedidoFunc_Produto obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
