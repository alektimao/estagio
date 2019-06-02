package br.com.maplebearsystem.dao;

import javax.persistence.EntityManager;

import br.com.maplebearsystem.model.Restricao_Alimento;
import br.com.maplebearsystem.persistance.JPAUtil;

public class Restricao_AlimentoDAO extends GenericDAO<Restricao_Alimento> {

	public Restricao_AlimentoDAO() {
		super(Restricao_Alimento.class);
	}

	public void delete2(Long id) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Restricao_Alimento r = em.find(Restricao_Alimento.class, id);
		em.remove(r);
		em.getTransaction().commit();
	}

	@Override
	public Long getID(Restricao_Alimento obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
