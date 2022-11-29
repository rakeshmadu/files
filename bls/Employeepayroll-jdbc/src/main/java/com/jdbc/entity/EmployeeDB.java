package com.jdbc.entity;

import java.util.ArrayList;

public class EmployeeDB {

	static ArrayList<EmployeePayroll> employeeDB = new ArrayList<EmployeePayroll>();
	
	public static ArrayList<EmployeePayroll> getEmployeeDB() {
		return employeeDB;
	}
}
