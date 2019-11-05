package br.com.maplebearsystem.controller;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class MaplePreferences {

	public static final String DWOR_DATABASEMANAGER_HOST = "DWOR_DATABASEMANAGER_HOST";
	public static final String DWOR_DATABASEMANAGER_USERNAME = "DWOR_DATABASEMANAGER_USERNAME";
	public static final String DWOR_DATABASEMANAGER_PORT = "DWOR_DATABASEMANAGER_PORT";
	public static final String DWOR_DATABASEMANAGER_PASS = "DWOR_DATABASEMANAGER_PASS";

	private static Preferences javaUtilPreferences = Preferences.userNodeForPackage(MaplePreferences.class);

	public static String getString(String key) {
		return javaUtilPreferences.get(key, "");
	}

	public static void putString(String key, String value) {
		javaUtilPreferences.put(key, value);
	}
	
	public static void clear() throws BackingStoreException {
		javaUtilPreferences.clear();
	}
}
