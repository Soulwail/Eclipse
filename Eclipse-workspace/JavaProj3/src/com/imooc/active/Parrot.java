package com.imooc.active;

public class Parrot extends Animal implements IAct {
	
	// ���ԣ�Ʒ��
	private String type;
	
	// �޲ι��췽��
	public Parrot() {
		
	}
	
	// ���ι��췽��
	public Parrot(String type) {
		super("Rose", 1);
		this.setType(type);
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	// �ӿڳ��󷽷�
	public String skill() {
		String str = "�ó�ģ��";
		return str;
	}
	
	public void act() {
		System.out.println("�����ߣ�" + this.getName());
		System.out.println("���䣺" + this.getAge() + "��");
		System.out.println("Ʒ�֣�" + this.getType());
		System.out.println("���ܣ�" + this.skill());
		System.out.println("���ã�" + this.love());	
	}
	
	// ������󷽷�
	public String love() {
		String str = "ϲ���Լ��������";
		return str;
	}
}
