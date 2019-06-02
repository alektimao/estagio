package br.com.maplebearsystem.dao;

import javax.persistence.EntityManager;

import br.com.maplebearsystem.model.Restricao_Alimento;
import br.com.maplebearsystem.model.Restricao_Remedio;
import br.com.maplebearsystem.persistance.JPAUtil;

public class Restricao_RemedioDAO extends GenericDAO<Restricao_Remedio> {

	public Restricao_RemedioDAO() {
		super(Restricao_Remedio.class);
	}
	public void delete2(Long id) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Restricao_Remedio r = em.find(Restricao_Remedio.class, id);
		em.remove(r);
		em.getTransaction().commit();
	}

	@Override
	public Long getID(Restricao_Remedio obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
