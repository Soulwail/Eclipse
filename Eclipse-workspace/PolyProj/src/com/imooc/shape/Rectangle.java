package com.imooc.shape;

public class Rectangle extends Shape {
    // 属性：矩形的长lenghth、宽wide
	private double length;
	private double wide;

	// 创建带参构造方法以及无参构造方法
	public Rectangle() {
		
	}

	public Rectangle(double length, double wide) {
		this.setLength(length);
		this.setWide(wide);
	}
	
    // 创建针对长、宽的赋值和取值方法
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

	// 重写父类的area（）方法
	public void area() {
		System.out.println("圆的面积为  " + this.getLength() * this.getWide());
	}
}
