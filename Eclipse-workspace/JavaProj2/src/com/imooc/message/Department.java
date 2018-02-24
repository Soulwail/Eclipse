package com.imooc.message;

public class Department {
	// 成员属性：部门编号、部门名称
	private String departNum;
	private String departName;
	private Staff[] department;
	private int staffNum;

	// 无参构造方法
	public Department() {

	}

	// 多参构造方法，实现对部门名称和部门编号属性的赋值
	public Department(String departNum, String departName) {
		this.setDepartNum(departNum);
		this.setDepartName(departName);
	}

	// 多参构造方法，实现所有属性的赋值
	public Department(String departNum, String departName, Staff[] department) {
		this.setDepartNum(departNum);
		this.setDepartName(departName);
		this.setDepartment(department);
	}

	public void setDepartNum(String departNum) {
		this.departNum = departNum;
	}

	public String getDepartNum() {
		return this.departNum;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartName() {
		return this.departName;
	}

	/**
	 * 获取部门内人员信息，如果保存部门人员信息的数组未被初始化，则先初始化长度为10
	 * 
	 * @return 保存部门人员信息的数组
	 */
	public Staff[] getDepartment() {
		if (this.department == null) {
			this.department = new Staff[100];
		}
		return department;
	}

	public void setDepartment(Staff[] department) {
		this.department = department;
	}

	public int getStaffNum() {
		return staffNum;
	}

	public void setStaffNum(int staffNum) {
		this.staffNum = staffNum;
	}

	public void addStaff(Staff staff) {
		/*
		 * 1、将员工保存到数组中 2、将员工人数保存到staffNum
		 */
		// 1、将员工保存到数组中
		int i;

		for (i = 0; i < this.getDepartment().length; i++) {
			if (this.getDepartment()[i] == null) {
				staff.setDepartSub(this);
				this.getDepartment()[i] = staff;
				break;
			}
		}

		// 2、将员工人数保存到staffNum
		this.staffNum = i + 1;
	}

}
