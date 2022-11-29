package com.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

	static final String URL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
	static final String USER_NAME = "root";
	static final String PASSWORD = "";
	
	static Connection connection = null;
	private static Config config = new Config();
	
	private Config() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public static Config getInstance() {
		return config;
	}
}
