package com.imooc.active;

public class Lion extends Animal implements IAct {
	
	// ���ԣ���ɫ���Ա�
	private String color;
	private String sex;
	
	// �޲ι��췽��
	public Lion() {
		
	}
	
	// ���ι��췽����ʵ�ֶ���ɫ���Ա����Եĸ�ֵ
	public Lion(String color, String sex) {
		super("Lain", 2);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// �Ա��ж�
	public void setSex(String sex) {
		if (!sex.equals("��") || !sex.equals("ĸ")) {
			sex = "��";
		}
		
		this.sex = sex;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	// �ӿڳ��󷽷�
	public String skill() {
		String str = "�ó����Ȧ";
		return str;
	}
	
	public void act() {
		System.out.println("�����ߣ�" + this.getName());
		System.out.println("���䣺" + this.getAge() + "��");
		System.out.println("�Ա�" + this.getSex() + "ʨ");
		System.out.println("ëɫ��" + this.getColor() + "ɫ");
		System.out.println("���ܣ�" + this.skill());
		System.out.println("���ã�" + this.love());
	}
	
	// ������󷽷�
	@Override
	public String love() {
		String str = "ϲ���Ը�������";
		return str;
	}
}
