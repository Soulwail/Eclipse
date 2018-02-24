package com.imooc.main;

public class Car {
    //���ԣ�������ɫcolor����������userName
	private String color;
	private String userName;

	public Car(){
		
	}
	
	//���ι��캯��������Ϊcolor��useName��
	public Car(String color, String userName) {
		this.setColor(color);
		this.setUserName(userName);
	}

    //ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
    //�����޲��޷���ֵ�÷���use����������Ϊ�����ǻ���������
	public void use() {
		System.out.println("���ǻ�������");
	}

	//��дequals�������Ƚ����������Ƿ���ȣ��Ƚ�color��userName��
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Car temp = (Car) obj;
		if (this.getColor().equals(temp.getColor()) && this.getUserName().equals(temp.getUserName())) {
			return true;
		}
		else
			return false;
	}
}
