package com.imooc.active;

public class Clown implements IAct {
	
	// ���ԣ����֡�����
	private String name;
	private int year;
	
	// �޲ι��췽��
	public Clown() {
		
	}
	
	// ���ι��췽����ʵ�ж����֡��������Եĸ�ֵ
	public Clown(String name, int age) {
		this.setName(name);
		this.setYear(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// �ӿڳ��󷽷�
	public String skill() {
		String str = "�Ųȸ��Σ������Ӽ�ħ������";
		return str;
	}
	
	public void act() {
		System.out.println("�����ߣ�" + this.getName());
		System.out.println("���䣺" + this.getYear() + "��");
		System.out.println("���ã�" + this.dress());
		System.out.println("���ܣ�" + this.skill());
	}
	
	// ��װ����
	public String dress() {
		String str = "����ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ�����ŵĲ�ױ";
		return str;
	}
}
