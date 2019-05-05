package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.persistance.JPAUtil;

public class FornecedorProductDAO extends GenericDAO<FornecedorProduct> {

	public FornecedorProductDAO() {
		super(FornecedorProduct.class);
	}

	@Override
	public FornecedorProduct save(FornecedorProduct obj) {

		String jpqlQuery = "select r from FornecedorProduct r where lower(r.produto.shortDescription) =  :pDescription";
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		TypedQuery<FornecedorProduct> query = em.createQuery(jpqlQuery, FornecedorProduct.class);
		query.setParameter("pDescription", obj.getProduct().getShortDescription().toLowerCase());

		try {
			FornecedorProduct result = query.getSingleResult();

			em.getTransaction().commit();

			// check if is not the same object
//			if (!result.getId().equals(obj.getId())) {
//				throw new EntityExistsException("Error: Product with the same description already exists");
//			}

			return super.save(obj);
		} catch (NoResultException e) {
			// Save when query has no result
			return super.save(obj);
		} catch (EntityExistsException e) {

			throw e;

		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

		return null;

	}

	public List<FornecedorProduct> listAllProduct() {

		List<FornecedorProduct> list;

		String jpqlQuery = "select r from FornecedorProduct r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<FornecedorProduct> query = em.createQuery(jpqlQuery, FornecedorProduct.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<FornecedorProduct> listProduct(String filter) {
		List<FornecedorProduct> list;

		String jpqlQuery = "select r from FornecedorProduct r where lower(r.produto.shortDescription) LIKE :pProductDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<FornecedorProduct> query = em.createQuery(jpqlQuery, FornecedorProduct.class);
		query.setParameter("pProductDescription", "%" + filter.toLowerCase() + "%");
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
	public Long getID(FornecedorProduct obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
