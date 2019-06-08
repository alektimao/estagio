package br.com.maplebearsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.ProgramParameter;
import br.com.maplebearsystem.persistance.JPAUtil;


public class ProgramParameterDAO extends GenericDAO<ProgramParameter> {

	public ProgramParameterDAO() {
		super(ProgramParameter.class);
	}

	@Override
	public Long getID(ProgramParameter obj) {
		return obj.getId();
	}

	public ProgramParameter find() throws Exception {
		EntityManager em = JPAUtil.getEntityManager();
		ProgramParameter obj = null;
		String jpqlQuery = "select Res from ProgramParameter Res ORDER BY Res.id ASC";
		try {
			em.getTransaction().begin();

			TypedQuery<ProgramParameter> query = em.createQuery(jpqlQuery, ProgramParameter.class);

			obj = query.setMaxResults(1).getSingleResult();

			em.getTransaction().commit();
		} catch (NoResultException e) {
			obj = null;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			throw ex;
		} finally {
			em.close();
		}
		return obj;
	}
}
