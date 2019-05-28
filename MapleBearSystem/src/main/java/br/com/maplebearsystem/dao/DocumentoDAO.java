package br.com.maplebearsystem.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.persistance.JPAUtil;

public class DocumentoDAO extends GenericDAO<Documento> {

	public DocumentoDAO() {
		super(Documento.class);
	}
	
	public List<Documento> listAllDocumento() {

		List<Documento> list;

		String jpqlQuery = "select r from Documento r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Documento> query = em.createQuery(jpqlQuery, Documento.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}
	
	public List<Documento> listApprovedBudgetOrders(String documento,String nomealuno) {

		Root<Documento> DocumentoRoot;

		List<Documento> result;

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		CriteriaQuery<Documento> criteriaQuery = criteriaBuilder.createQuery(Documento.class);

		DocumentoRoot = criteriaQuery.from(Documento.class);

		Predicate pEqualsResponsavel1 = criteriaBuilder.equal(DocumentoRoot.get("documento"), documento);
		
		Predicate pEqualsAluno = criteriaBuilder.equal(DocumentoRoot.get("Aluno").get("nome"), nomealuno);

		Predicate filtros = criteriaBuilder.and(pEqualsResponsavel1, pEqualsAluno);

		criteriaQuery.select(DocumentoRoot).where(filtros).orderBy(criteriaBuilder.asc(DocumentoRoot.get("id")));

		result = em.createQuery(criteriaQuery).getResultList();

		em.getTransaction().commit();

		return result;
	}
	
	public List<Documento> listDocumento(String filter) {
		List<Documento> list;

		String jpqlQuery = "select r from Documento r where lower(r.documento) LIKE :pDocumentoDescription";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Documento> query = em.createQuery(jpqlQuery, Documento.class);
		query.setParameter("pDocumentoDescription", "%" + filter.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	@Override
	public Long getID(Documento obj) {
		return obj.getId();
	}

	public void save(List<Documento> obj) {

		EntityManager em = JPAUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			for (Documento product : obj) {
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

	public List<Documento> listDocumento(Long id) {
		List<Documento> list;

		String jpqlQuery = "select r from Documento r where r.id = :pId";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Documento> query = em.createQuery(jpqlQuery, Documento.class);
		query.setParameter("pId",id);
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

}
