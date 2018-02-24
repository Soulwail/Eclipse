package com.imooc.message;

/**
 * 员工信息
 * 
 * @author 87945
 */
public class Staff {
	// 成员属性：员工姓名、工号、年龄、性别、职务信息
	private String name;
	private String number;
	private int age;
	private String sex;
	private Department departSub;
	private Duty dutyName;

	// 无参构造方法
	public Staff() {

	}
	
	// 带参构造方法，实现对员工姓名、工号、年龄、性别、职务信息属性的赋值
	public Staff(String name, String number, int age, String sex, Duty dutyName) {
		this.setName(name);
		this.setNumber(number);
		this.setAge(age);
		this.setSex(sex);
		this.setDutyName(dutyName);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	// 对年龄进行限制
	public void setAge(int age) {
		if (age < 0 || age < 18 || age > 65) {
			this.age = 18;
		} else
			this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	// 对性别进行限制
	public void setSex(String sex) {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		} else
			this.sex = "男";
	}

	public String getSex() {
		return this.sex;
	}

	public void setDutyName(Duty dutyName) {
		this.dutyName = dutyName;
	}

	public Duty getDutyName() {
		if (this.dutyName == null) {
			this.dutyName = new Duty();
		}
		return this.dutyName;
	}

	/**
	 * 获取部门名称，如果没有实例化，先实例化再返回
	 * 
	 * @return 部门名称
	 */
	public Department getDepartSub() {
		if (this.departSub == null) {
			this.departSub = new Department();
		}
		return departSub;
	}

	public void setDepartSub(Department departSub) {
		this.departSub = departSub;
	}

	/**
	 * 员工信息
	 * 
	 * @return 员工介绍的相关信息：包括员工姓名、工号、年龄、性别、所属部门、职务信息
	 */
	public String info() {
		String str = "姓名：" + this.getName() + "\n工号：" + this.getNumber() + "\n性别：" + this.getSex() + "\n年龄："
				+ this.getAge() + "\n职务：" + this.getDepartSub().getDepartName() + this.getDutyName().getDutyName() + "\n=======================";
		return str;
	}
}
