package com.imooc.active;

public abstract class Animal {
	
	// ���ԣ��ǳơ�����
	private String name;
	private int age;
	
	// �޲ι��췽��
	public Animal() {
		
	}
	
	// ���ι��췽����ʵ�ֶ��ǳơ��������Եĸ�ֵ
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
	
	// �������������
	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	// ���󷽷�������ϲ��
	public abstract String love();
	
}
