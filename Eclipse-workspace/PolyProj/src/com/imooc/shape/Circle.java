package com.imooc.shape;

import java.text.DecimalFormat;

// 子类圆Circle类
public class Circle extends Shape {
    // 属性：圆的半径r
	private double r;

	
    // 创建带参构造方法以及无参构造方法
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	// 创建针对半径的赋值和取值方法
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	// 重写父类中area()方法
	public void area() {
		DecimalFormat r = new DecimalFormat("0.###");
		System.out.println("矩形的面积为  " + r.format(Math.PI * this.getR() * this.getR()));
	}
}
