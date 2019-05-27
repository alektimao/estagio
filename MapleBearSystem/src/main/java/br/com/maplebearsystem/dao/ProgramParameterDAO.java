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

	/**
	 * Specialized type to persist child objects
	 * {@link ProgramParameter#Organization} and
	 * {@link ProgramParameter#Administrator}
	 *
	 */
	@Override
	public ProgramParameter save(ProgramParameter obj) {
		EntityManager em = JPAUtil.getEntityManager();

		if (obj.getId() == null) {

			try {
				em.getTransaction().begin();

				if (obj.getOrganization().getId() == null) {
					em.persist(obj.getOrganization());
				} else {
					em.merge(obj.getOrganization());
				}
				if (obj.getAdministrator().getPessoa().getId() == null) {
					em.persist(obj.getAdministrator().getPessoa());
				} else {
					em.merge(obj.getAdministrator().getPessoa());
				}
				if (obj.getAdministrator().getId() == null) {
					em.persist(obj.getAdministrator());
				} else {
					em.merge(obj.getAdministrator());
				}

				em.persist(obj);

				em.getTransaction().commit();
			} catch (Exception ex) {
				em.getTransaction().rollback();
				ex.printStackTrace();
				throw ex;
			} finally {
				em.close();
			}
		} else {
			this.merge(obj);
		}

		return obj;

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
