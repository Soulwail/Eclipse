package com.imooc.main;

public class HomeCar extends Car{
    //˽�����ԣ��ؿ�����num��
	private int num;
	
	public HomeCar(){
		
	}
	//���ι��췽��Ϊ�������Ը�ֵ
	public HomeCar(int num) {
		super("��","�����");
		this.setNum(num);
	}

	//ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
   
	//�����޲��޷���ֵ��display����������Ϊ��**ӵ�е�**��ɫ��˽�ҳ�,��**��λ
	public void display() {
		System.out.println(this.getUserName() + "ӵ�е�" + this.getColor() + "��ɫ��˽�ҳ�,��" + this.getNum() + "��λ");
	}

	//����display������������num��������Ϊ���������������**����λ
	public void displaly(int num) {
		System.out.println("�������������" + num + "����λ");
	}
}
