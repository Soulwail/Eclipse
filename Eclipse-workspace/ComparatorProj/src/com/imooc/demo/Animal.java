package com.imooc.demo;

public abstract class Animal {
	// ����
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
	
	// ���󷽷�
	public abstract void play();
	

}
