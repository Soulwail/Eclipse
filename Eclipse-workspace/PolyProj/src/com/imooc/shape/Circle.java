package com.imooc.shape;

import java.text.DecimalFormat;

// ����ԲCircle��
public class Circle extends Shape {
    // ���ԣ�Բ�İ뾶r
	private double r;

	
    // �������ι��췽���Լ��޲ι��췽��
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	// ������԰뾶�ĸ�ֵ��ȡֵ����
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	// ��д������area()����
	public void area() {
		DecimalFormat r = new DecimalFormat("0.###");
		System.out.println("���ε����Ϊ  " + r.format(Math.PI * this.getR() * this.getR()));
	}
}
