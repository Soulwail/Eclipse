package com.imooc.active;

public class Bear extends Animal implements IAct {
	
	// �޲ι��췽��
	public Bear() {
		super("Bill", 1);
	}
	
	public String skill() {
		String str = "���Ż�����������ɡ����������";
		return str;
		
	}
	
	public void act() {
		System.out.println("�����ߣ�" + this.getName());
		System.out.println("���䣺" + this.getAge() + "��");
		System.out.println("���ܣ�" + this.skill());
		System.out.println("���ã�" + this.love());
		
	}
	
	// ������󷽷�
	@Override
	public String love() {
		String str = "ϲ������";
		return str;
	}
}
