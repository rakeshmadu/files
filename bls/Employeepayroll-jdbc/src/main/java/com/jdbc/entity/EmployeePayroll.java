package com.jdbc.entity;

public class EmployeePayroll {

	int id;
	String name;
	String startDate;
	String gender;
	int phone;
	String address;
	String department;
	double salary;
	double basicPay;
	double deductions;
	double taxablePay;
	double incomeTax;
	double netPay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeePayroll(int id, String name, String startDate, String gender, int phone, String address,
			String department, double salary, double basicPay, double deductions, double taxablePay, double incomeTax,
			double netPay) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.department = department;
		this.salary = salary;
		this.basicPay = basicPay;
		this.deductions = deductions;
		this.taxablePay = taxablePay;
		this.incomeTax = incomeTax;
		this.netPay = netPay;
	}

	@Override
	public String toString() {
		return "EmployeePayroll [id=" + id + ", name=" + name + ", startDate=" + startDate + ", gender=" + gender
				+ ", phone=" + phone + ", address=" + address + ", department=" + department + ", salary=" + salary
				+ ", basicPay=" + basicPay + ", deductions=" + deductions + ", taxablePay=" + taxablePay
				+ ", incomeTax=" + incomeTax + ", netPay=" + netPay + "]";
	}

}
