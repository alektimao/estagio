package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Fornecedor;
import br.com.maplebearsystem.persistance.JPAUtil;

public class FornecedorDAO extends GenericDAO<Fornecedor> {

	public FornecedorDAO() {
		super(Fornecedor.class);
	}

	public List<Fornecedor> listAllFornecedor() {

		List<Fornecedor> list;

		String jpqlQuery = "select r from Fornecedor r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Fornecedor> query = em.createQuery(jpqlQuery, Fornecedor.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Fornecedor> listFornecedor(String filter) {
		List<Fornecedor> list;

		String jpqlQuery = "select r from Fornecedor r where lower(r.pessoa.razaoSocial) LIKE :pRazaoSocial";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Fornecedor> query = em.createQuery(jpqlQuery, Fornecedor.class);
		query.setParameter("pRazaoSocial", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Fornecedor obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
