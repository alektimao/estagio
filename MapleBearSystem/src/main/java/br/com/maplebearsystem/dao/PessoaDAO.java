/**
 * 
 */
package br.com.maplebearsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.persistance.JPAUtil;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class PessoaDAO extends GenericDAO<Pessoa> {

	/**
	 * 
	 */
	public PessoaDAO() {
		super(Pessoa.class);
	}

	@Override
	public Long getID(Pessoa obj) {
		return obj.getId();
	}

	public List<Pessoa> findByName(String name) {

		List<Pessoa> list;

		String jpqlQuery = "select r from Pessoa r where lower(r.name) LIKE :pNome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Pessoa> query = em.createQuery(jpqlQuery, Pessoa.class);
		query.setParameter("pNome", "%" + name.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<PessoaFisica> findFisicaByName(String name) {
		List<PessoaFisica> list;

		String jpqlQuery = "select r from PessoaFisica r where lower(r.nome) LIKE :pNome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PessoaFisica> query = em.createQuery(jpqlQuery, PessoaFisica.class);
		query.setParameter("pNome", "%" + name.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<PessoaJuridica> findJuridicaByName(String name) {

		List<PessoaJuridica> list;

		String jpqlQuery = "select r from PessoaJuridica r where lower(r.name) LIKE :pNome";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PessoaJuridica> query = em.createQuery(jpqlQuery, PessoaJuridica.class);
		query.setParameter("pNome", "%" + name.toLowerCase() + "%");
		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

	public List<PessoaFisica> listByTypeAll() {

		List<PessoaFisica> list;

		// uma query JPQL é escrita se referenciando aos nomes e atributos dos
		// objetos e não das entidades do banco
		String jpqlQuery = "select r from PessoaFisica r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PessoaFisica> query = em.createQuery(jpqlQuery, PessoaFisica.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;

	}

	public List<PessoaJuridica> listJuridicaAll() {

		List<PessoaJuridica> list;

		// uma query JPQL é escrita se referenciando aos nomes e atributos dos
		// objetos e não das entidades do banco
		String jpqlQuery = "select r from PessoaJuridica r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PessoaJuridica> query = em.createQuery(jpqlQuery, PessoaJuridica.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;

	}

	public List<PessoaFisica> listFisicaAll() {
		List<PessoaFisica> list;

		// uma query JPQL é escrita se referenciando aos nomes e atributos dos
		// objetos e não das entidades do banco
		String jpqlQuery = "select r from PessoaFisica r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<PessoaFisica> query = em.createQuery(jpqlQuery, PessoaFisica.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;

	}

	public List<Pessoa> listAll() {
		List<Pessoa> list;

		// uma query JPQL é escrita se referenciando aos nomes e atributos dos
		// objetos e não das entidades do banco
		String jpqlQuery = "select r from Pessoa r ORDER BY r.id ASC";

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		TypedQuery<Pessoa> query = em.createQuery(jpqlQuery, Pessoa.class);

		list = query.getResultList();

		em.getTransaction().commit();

		return list;
	}

//	@Override
//	public Pessoa save(Pessoa obj) {
//		String jpqlQuery = null;
//
//		if (obj instanceof PessoaFisica)
//			jpqlQuery = "select r from PessoaFisica r where r.cpf = :pCPF AND r.cpf <> '' OR r.rg = :pRG AND r.rg <> ''";
//		else if (obj instanceof PessoaJuridica)
//			jpqlQuery = "select r from PessoaJuridica r where r.cnpj = :pCNPJ AND r.cnpj <> ''";
//
//		EntityManager em = JPAUtil.getEntityManager();
//		em.getTransaction().begin();
//		TypedQuery<Pessoa> query = em.createQuery(jpqlQuery, Pessoa.class);
//
//		if (obj instanceof PessoaFisica) {
//			query.setParameter("pCPF", ((PessoaFisica) obj).getCpf());
//			query.setParameter("pRG", ((PessoaFisica) obj).getRg());
//		} else if (obj instanceof PessoaJuridica) {
//			query.setParameter("pCNPJ", ((PessoaJuridica) obj).getCnpj());
//		}
//
//		try {
//			Pessoa result = query.getSingleResult();
//
//			em.getTransaction().commit();
//
//			// check if is not the same object
//			if (obj instanceof PessoaFisica) {
//				if (((PessoaFisica) result).getRg().equals(((PessoaFisica) obj).getRg())
//						|| ((PessoaFisica) result).getRg().equals(((PessoaFisica) obj).getRg()))
//					throw new EntityExistsException("Error: PessoaFisica with the same identity already exists");
//			} else if (obj instanceof PessoaJuridica) {
//				if (((PessoaJuridica) result).getCnpj().equals(((PessoaJuridica) obj).getCnpj()))
//					throw new EntityExistsException("Error: PessoaJuridica with the same identity already exists");
//			}
//
//			// Save if result found but is the same object
//			return super.save(obj);
//		} catch (NoResultException e) {
//			// Save when query has no result
//			return super.save(obj);
//		} catch (EntityExistsException e) {
//			throw e;
//		} catch (EntityNotFoundException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		return null;
//	}

}
