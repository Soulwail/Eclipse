package com.imooc.user;

public class User {
    //���������û���������
	private String name;
	private String password;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public void message() {
		System.out.println("�û�����" + this.getName());
		System.out.println("���룺" + this.getPassword());
	}
}
