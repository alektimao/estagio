/**
 * 
 */
package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.ProvinceState;
import br.com.maplebearsystem.persistance.JPAUtil;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class ProvinceStateDAO extends GenericDAO<ProvinceState> {

	public ProvinceStateDAO() {
		super(ProvinceState.class);
	}

	@Override
	public Long getID(ProvinceState obj) {
		return obj.getId();
	}

	public List<ProvinceState> findByName(String name) {

		List<ProvinceState> list;

		String jpqlQuery = "select r from ProvinceState r where lower(r.name) LIKE :pNome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<ProvinceState> query = em.createQuery(jpqlQuery, ProvinceState.class);
		query.setParameter("pNome", "%" + name.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<ProvinceState> findAll() {
		List<ProvinceState> list;

		// uma query JPQL é escrita se referenciando aos nomes e atributos dos
		// objetos e não das entidades do banco
		String jpqlQuery = "select r from ProvinceState r ORDER BY r.name ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<ProvinceState> query = em.createQuery(jpqlQuery, ProvinceState.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
}
