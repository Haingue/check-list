package com.haingue.checklist.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPDO {

	private static String className = "org.postgresql.Driver";
	private static String host = "jdbc:postgresql://localhost:5432/check-list";
	private static String name = "fabien";
	private static String password = "moi";

	static ResultSet sqlQuery(String request) {
		System.out.println("Requete:\t" + request);
		Connection con = null;
		Statement stmt;
		ResultSet rs = null;
		try {
			Class.forName(ConnectionPDO.className);
			con = DriverManager.getConnection(ConnectionPDO.host, ConnectionPDO.name, ConnectionPDO.password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(request);
		} catch (SQLException e) {
			System.out.println("Error Sql: " + e.getMessage());
		} catch (Exception er) {
			System.out.println("Error " + er.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return rs;
	}

	static void sqlUpdate(String request) {
		System.out.println("Requete:\t" + request);
		Connection con = null;
		Statement stmt;
		try {
			Class.forName(ConnectionPDO.className);
			con = DriverManager.getConnection(ConnectionPDO.host, ConnectionPDO.name, ConnectionPDO.password);
			stmt = con.createStatement();
			stmt.executeUpdate(request);
		} catch (SQLException e) {
			System.out.println("Error Sql: " + e.getMessage());
		} catch (Exception er) {
			System.out.println("Error " + er.getMessage());
		}
	}

}
