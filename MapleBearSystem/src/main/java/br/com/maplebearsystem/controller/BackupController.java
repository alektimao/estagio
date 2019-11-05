package br.com.maplebearsystem.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BackupController {

	public void doBackup(String path) {

		
		String host = "--host=" + MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_HOST);
		String port = "--port=" + MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_PORT);
		String username = "--username=" + MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_USERNAME);
		String pass = MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_PASS);

		String filepath = "--file=" + path;
		//TODO: fix time format
		 filepath += "/backup_" + LocalDate.now() + "_" + LocalTime.now().getHour() +
				 "-" + LocalTime.now().getMinute()
				 + "-" + LocalTime.now().getSecond() + ".backup";

		Logger.getLogger(this.getClass().getName()).log(Level.INFO, "filepath = " + filepath);

		

		ProcessBuilder pb = new ProcessBuilder(
				"pg_dump",
				host,
				port,
				"--dbname=dwordb",
				username,
				"--format=custom",
				filepath);

		pb.environment().put("PGPASSWORD", pass);

		try {
			final Process process = pb.start();

			final BufferedReader r = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String line = r.readLine();
			while (line != null) {
				System.err.println(line);
				line = r.readLine();
			}
			r.close();

			process.waitFor();
			process.destroy();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
