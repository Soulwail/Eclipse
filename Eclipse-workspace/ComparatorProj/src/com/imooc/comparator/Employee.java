package com.imooc.comparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	@Override
	public int compareTo(Employee arg0) {
		double salary1=this.getSalary();
		double salary2=arg0.getSalary();
		int n = new Double(salary2-salary1).intValue();
		return n;
	}

	// 成员变量
	private String id;
	private String name;
	private double salary;

	// 构造方法
	public Employee(String id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}

	// getter和setter方法
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	// toString()方法
	public String toString() {
		return "员工[编号：" + this.getId() + "，姓名：" + this.getName() + "，工资：" + this.getSalary() + "]";
	}



}
