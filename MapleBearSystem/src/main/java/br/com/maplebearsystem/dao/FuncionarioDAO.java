package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.persistance.JPAUtil;

public class FuncionarioDAO extends GenericDAO<Funcionario> {

	public FuncionarioDAO() {
		super(Funcionario.class);
	}

	public List<Funcionario> listAllFuncionario() {

		List<Funcionario> list;

		String jpqlQuery = "select r from Funcionario r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Funcionario> query = em.createQuery(jpqlQuery, Funcionario.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<Funcionario> listFuncionario(String filter) {
		List<Funcionario> list;

		String jpqlQuery = "select r from Funcionario r where lower(r.pessoa.name) LIKE :pname";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Funcionario> query = em.createQuery(jpqlQuery, Funcionario.class);
		query.setParameter("pname", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Funcionario obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
