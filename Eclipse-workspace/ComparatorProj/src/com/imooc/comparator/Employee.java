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

	// ��Ա����
	private String id;
	private String name;
	private double salary;

	// ���췽��
	public Employee(String id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}

	// getter��setter����
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

	// toString()����
	public String toString() {
		return "Ա��[��ţ�" + this.getId() + "��������" + this.getName() + "�����ʣ�" + this.getSalary() + "]";
	}



}
