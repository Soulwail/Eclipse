package com.imooc.user;

public class User {
    //定义属性用户名、密码
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
		System.out.println("用户名：" + this.getName());
		System.out.println("密码：" + this.getPassword());
	}
}
