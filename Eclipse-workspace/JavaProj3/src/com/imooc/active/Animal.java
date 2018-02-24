package com.imooc.active;

public abstract class Animal {
	
	// 属性：昵称、年龄
	private String name;
	private int age;
	
	// 无参构造方法
	public Animal() {
		
	}
	
	// 带参构造方法，实现对昵称、年龄属性的赋值
	public Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 对年龄进行限制
	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	// 抽象方法：描述喜好
	public abstract String love();
	
}
