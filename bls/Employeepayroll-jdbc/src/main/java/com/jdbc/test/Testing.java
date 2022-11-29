package com.jdbc.test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

import com.jdbc.config.Config;
import com.jdbc.service.PreparedStatementDB;
import com.jdbc.service.StatementDB;

public class Testing {
	
	Connection connection;
	Config config;
	StatementDB statement;
	PreparedStatementDB pStatement;
	
	@Before
	public void initialization() {
		config = Config.getInstance();
		connection = config.getConnection();
		statement = new StatementDB(connection);
		pStatement = new PreparedStatementDB(connection);
	}


	@Test
	public void testPreparedUpdateHappy() {
		statement.read();
		pStatement.update();

		assertEquals(pStatement.checkUpdate(), true);
	}
}
