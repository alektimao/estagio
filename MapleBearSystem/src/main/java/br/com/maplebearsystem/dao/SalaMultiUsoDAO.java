package br.com.maplebearsystem.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.SalaMultiUso;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.WeekDays;
import br.com.maplebearsystem.persistance.JPAUtil;

public class SalaMultiUsoDAO extends GenericDAO<SalaMultiUso> {

	public SalaMultiUsoDAO() {
		super(SalaMultiUso.class);
	}
	
	public List<SalaMultiUso> listAllSalaMultiUso() {

		List<SalaMultiUso> list;

		String jpqlQuery = "select r from SalaMultiUso r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<SalaMultiUso> query = em.createQuery(jpqlQuery, SalaMultiUso.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<SalaMultiUso> listAllSalaMultiUso(String filter) {

		List<SalaMultiUso> list;

		String jpqlQuery = "select r from SalaMultiUso r where lower(r.nomeatividade) LIKE :pTurmaPersonalizadaDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<SalaMultiUso> query = em.createQuery(jpqlQuery, SalaMultiUso.class);
		query.setParameter("pTurmaPersonalizadaDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	public List<Aluno> listAlunosBusca(String cpf,String nometurma,String numeromatricula) {

		Root<Aluno> AlunoRoot;

		List<Aluno> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<Aluno> criteriaQuery = criteriaBuilder.createQuery(Aluno.class);

		AlunoRoot = criteriaQuery.from(Aluno.class);
		
		List<Predicate> filtros = new ArrayList<Predicate>();
		
		if (nometurma != null && !nometurma.equals("")) {
			Predicate pEqualsTurma = criteriaBuilder.equal(AlunoRoot.get("nome"), nometurma);
			filtros.add(pEqualsTurma);
		}
		if (cpf != null && !cpf.equals("")) {
			Predicate pEqualscpf = criteriaBuilder.equal(AlunoRoot.get("cpf"), cpf);
			filtros.add(pEqualscpf);
		}
		
		if (numeromatricula != null && !numeromatricula.equals("")) {
			Predicate pEqualsnumeromatricula = criteriaBuilder.equal(AlunoRoot.get("numeromatricula"), numeromatricula);			
			filtros.add(pEqualsnumeromatricula);
		}
		
		//Predicate filtros2 = criteriaBuilder.any(filtros.toArray());
		
	    criteriaQuery.select(AlunoRoot).where(filtros.toArray(new Predicate[] {})).orderBy(criteriaBuilder.asc(AlunoRoot.get("id")));

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}
	
	public List<SalaMultiUso> HoraDuplicada(WeekDays dia,String horaini,String horafim) {
		List<SalaMultiUso> list;

		String jpqlQuery = "select r from SalaMultiUso r "
				+ "where (r.de LIKE :pSalaMultiUsoDe or r.ate LIKE :pSalaMultiUsoDe) and"
				+ "(r.de LIKE :pSalaMultiUsoAte or r.ate LIKE :pSalaMultiUsoAte)";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<SalaMultiUso> query = em.createQuery(jpqlQuery, SalaMultiUso.class);
		query.setParameter("pSalaMultiUsoDe",horaini);
		query.setParameter("pSalaMultiUsoAte",horafim);
		//query.setParameter("pSalaMultiUsoDia",dia.toString());
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<SalaMultiUso> listSalaMultiUso(String filter) {
		List<SalaMultiUso> list;

		String jpqlQuery = "select r from SalaMultiUso r where lower(r.nomeatividade) LIKE :pSalaMultiUsoDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<SalaMultiUso> query = em.createQuery(jpqlQuery, SalaMultiUso.class);
		query.setParameter("pSalaMultiUsoDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(SalaMultiUso obj) {
		return obj.getId();
	}

	public void save(List<SalaMultiUso> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (SalaMultiUso product : obj) {
				if (product.getId() == null) {
					em.persist(product);
				} else {
					em.merge(product);
				}
			}
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			throw ex;
		} finally {
			em.close();
		}
	}

}
