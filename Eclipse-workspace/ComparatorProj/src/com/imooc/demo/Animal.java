package com.imooc.demo;

public abstract class Animal {
	// 属性
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.setName(name);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// 抽象方法
	public abstract void play();
	

}
