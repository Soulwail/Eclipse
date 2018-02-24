package com.imooc.work2;

public class NonMotor {
    // ˽�����ԣ�Ʒ�ơ���ɫ������(Ĭ��2��)�����Σ�Ĭ�� 1����
	private String brand;
	private String color;
	private int wheel = 2;
	private int seat = 1;
	
	// �޲ι��췽��
	public NonMotor() {
		
	}

	// ˫�ι��췽������ɶ�Ʒ�ƺ���ɫ�ĸ�ֵ
	public NonMotor(String brand, String color) {
		this.setBrand(brand);
		this.setColor(color);
	}

	// �Ĳι��췽�����ֱ���������Ը�ֵ
	public NonMotor(String brand, String color, int wheel, int seat) {
		this.setBrand(brand);
		this.setColor(color);
		this.setWheel(wheel);
		this.setSeat(seat);
	}
   
	// ���е�get***/set***����������Է�װ
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return wheel;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public int getSeat() {
		return seat;
	}
	// ���������У���������Ϊ������һ��**��ɫ�ģ�**�Ƶķǻ���������**�����ӣ���**�����εķǻ�����������**�������������ṩ
	public String work() {
		String str = "����һ��" + this.brand + "��ɫ�ģ�" + this.color + "�Ƶķǻ���������" + this.wheel + "�����ӣ���" + this.seat + "�����εķǻ�������";
		return str;
	}
}
