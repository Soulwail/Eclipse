package com.imooc.shape;

public class Rectangle extends Shape {
    // ���ԣ����εĳ�lenghth����wide
	private double length;
	private double wide;

	// �������ι��췽���Լ��޲ι��췽��
	public Rectangle() {
		
	}

	public Rectangle(double length, double wide) {
		this.setLength(length);
		this.setWide(wide);
	}
	
    // ������Գ�����ĸ�ֵ��ȡֵ����
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWide(double wide) {
		this.wide = wide;
	}
	
	public double getWide() {
		return this.wide;
	}

	// ��д�����area��������
	public void area() {
		System.out.println("Բ�����Ϊ  " + this.getLength() * this.getWide());
	}
}
