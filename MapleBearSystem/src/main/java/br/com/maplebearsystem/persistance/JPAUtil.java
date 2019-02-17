/**
 * 
 */
package br.com.maplebearsystem.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gabriel L. P. Abreu
 */
public class JPAUtil {

	private static final EntityManagerFactory entityManagerFactory = Persistence
//			.createEntityManagerFactory("MapleBSystemPostgreSQLPU");
//			.createEntityManagerFactory("MapleBSystemHyperSQLDBPU");
			.createEntityManagerFactory("MapleBSystemHyperSQLDBStandAlonePU");

	public static EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public static void StopEntityManagerFactory() throws Throwable {
		entityManagerFactory.close();
	}
}