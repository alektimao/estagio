package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.City;
import br.com.maplebearsystem.model.ProvinceState;
import br.com.maplebearsystem.persistance.JPAUtil;

public class CityDAO extends GenericDAO<City> {

	public CityDAO() {
		super(City.class);
	}

	@Override
	public Long getID(City obj) {
		return obj.getId();
	}

	public List<City> findByName(String name) {

		List<City> list;

		String jpqlQuery = "select r from City r where lower(r.name) LIKE :pNome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<City> query = em.createQuery(jpqlQuery, City.class);
		query.setParameter("pNome", "%" + name.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<City> findByProvinceState(ProvinceState provinceState) {

		List<City> list;

		String jpqlQuery = "select distinct r from City r where r.provinceState = :pProvinceState";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<City> query = em.createQuery(jpqlQuery, City.class);
		query.setParameter("pProvinceState", provinceState);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public City getCityByNameAndProvinceStateAbbreviation(String name, String provinceStateAbbreviation) {

		City result;

		String jpqlQuery = "select r from City r where r.name = :pName and r.provinceState.abbreviation = :pProvinceStateAbbreviation";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<City> query = em.createQuery(jpqlQuery, City.class);
		query.setParameter("pName", name);
		query.setParameter("pProvinceStateAbbreviation", provinceStateAbbreviation);
		result = query.getSingleResult();

		em.getTransaction().commit();

		return result;
	}

}
