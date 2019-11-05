package br.com.maplebearsystem.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import br.com.maplebearsystem.controller.MaplePreferences;

public class DatabaseConnectionFactory {

	public static final String DWOR_DATABASE_DBNAME = "maplebd";

	public static Connection createConnection() throws SQLException {

		String host = MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_HOST);
		String port = MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_PORT);
		String username = MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_USERNAME);
		String pass = MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_PASS);

		return createConnection(host, port, username, pass);
	}

	private static Connection createConnection(String host, String port, String username, String pass)
			throws SQLException {
		
//		String url = "jdbc:hsqldb:file:data/db;hsqldb.write_delay=false";
				
		String url = "jdbc:postgresql://" + host + ":" + port + "/" + DWOR_DATABASE_DBNAME;

		Connection connection = DriverManager.getConnection(url, username, pass);

		return connection;
	}

	public static boolean testConnection() {
		try {
			Connection connection = createConnection();
			return connection.isValid(10);
		} catch (SQLException e) {
			
			Logger.getLogger(DatabaseConnectionFactory.class.getName())
					.log(Level.WARNING, "Failed to test connection", e);
		}

		return false;
	}

	public static boolean testConnection(String host, String port, String username, String pass) {
		try {
			Connection connection = createConnection(host, port, username, pass);
			return connection.isValid(10);
		} catch (SQLException e) {
			Logger.getLogger(DatabaseConnectionFactory.class.getName())
					.log(Level.WARNING, "Failed to test connection", e);
		}

		return false;
	}
}
