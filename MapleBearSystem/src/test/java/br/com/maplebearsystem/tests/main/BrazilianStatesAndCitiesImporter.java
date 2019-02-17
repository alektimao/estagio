package br.com.maplebearsystem.tests.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;

import javax.persistence.EntityManager;

import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.City;
import br.com.maplebearsystem.model.Federation;
import br.com.maplebearsystem.model.ProvinceState;
import br.com.maplebearsystem.persistance.JPAUtil;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;

public class BrazilianStatesAndCitiesImporter {

	public static void main(String[] args) {
		Gson g = new Gson();
		EntityManager em = JPAUtil.getEntityManager();

		try {
			URI uri = new URI(MapleBearSystemDesktopClient.class.getResource("/br/com/maplebearsystem/resources/estados-cidades.json").getPath()
					.toString());
			JsonReader reader = new JsonReader(new FileReader(uri.getPath()));
			BrasilianCities brasilianCities = g.fromJson(reader, BrasilianCities.class);

			em.getTransaction().begin();

			Federation federation = new Federation(null, "Brasil");
			em.persist(federation);

			for (ProvinceStateAux aux : brasilianCities.getEstados()) {

				ProvinceState state = new ProvinceState(null, aux.getNome(), aux.getSigla(),federation);

				em.persist(state);

				for (String cityaux : aux.getCidades()) {

					City city = new City(null, cityaux,state);

					em.persist(city);
				}

			}

			em.getTransaction().commit();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			em.getTransaction().rollback();
		}finally {
			em.close();
		}

	}

	private class BrasilianCities {
		private ProvinceStateAux[] estados;

		public ProvinceStateAux[] getEstados() {
			return estados;
		}

	}

	private class ProvinceStateAux {
		private String sigla;
		private String nome;
		private String[] cidades;

		public String getNome() {
			return nome;
		}

		public String[] getCidades() {
			return cidades;
		}
		public String getSigla() {
			return sigla;
		}
	}
}
