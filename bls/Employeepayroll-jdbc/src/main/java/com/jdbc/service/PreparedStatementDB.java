package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.entity.EmployeeDB;
import com.jdbc.entity.EmployeePayroll;

public class PreparedStatementDB {

	final static String FETCH_DB = "SELECT e.id, e.name, e.start_date, e.gender,"
			+ "	e.phone, e.address, d.department, p.salary, p. basic_pay, p.deductions,"
			+ "	p.taxable_pay, p.income_tax, p.net_pay FROM employee_payroll e LEFT JOIN department d"
			+ "	ON e.id = d.employee_id LEFT JOIN payroll p ON p.id = e.id";
	final static String UPDATE_DB = "UPDATE payroll SET Salary = ? WHERE name = ?";
	final static String SELECT_UPDATE = "SELECT Salary FROM payroll WHERE name = ?";
	Connection connection;

	public PreparedStatementDB(Connection connection) {
		// TODO Auto-generated constructor stub
		this.connection = connection;
	}

	public void update() {

		ArrayList<EmployeePayroll> db = EmployeeDB.getEmployeeDB();
		PreparedStatement pStatement = null;

		try {
			pStatement = connection.prepareStatement(UPDATE_DB);
			pStatement.setInt(1, 3000000);
			pStatement.setString(2, "Terissa");
			pStatement.execute();

			for (EmployeePayroll employeePayroll : db) {
				if (employeePayroll.getName().equals("Terissa")) {
					employeePayroll.setSalary(3000000);
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean checkUpdate() {
		double dbResult = -1;
		ArrayList<EmployeePayroll> db = EmployeeDB.getEmployeeDB();
		try {
			PreparedStatement pStatement = connection.prepareStatement(SELECT_UPDATE);
			pStatement.setString(1, "Terissa");
			ResultSet result = pStatement.executeQuery();

			if (result.next())
				dbResult = result.getDouble(1);

			for (EmployeePayroll employeePayroll : db) {
				if (employeePayroll.getName().equals("Terissa")) {
					if (dbResult == employeePayroll.getSalary())
						return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
