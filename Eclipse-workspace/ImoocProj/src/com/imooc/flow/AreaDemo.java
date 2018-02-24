package com.imooc.flow;

public class AreaDemo {
    //求圆形面积
	public double area(double x) {
		return Math.PI * (x * x);
	}
    
	//求长方形面积
	public double area(double x, double y) {
		return x * y;
	}

	public static void main(String[] args) {
		//定义对象
		AreaDemo areaDemo = new AreaDemo();
		
		//定义一个double类型的变量存放半径，并初始化
		double r = 4.5;
		
		//定义两个变量存放长和宽，并初始化
		double x = 8, y = 5;
		
		//调用方法，求圆的面积并打印输出
		System.out.println("圆的面积为：" + areaDemo.area(r));
		
		//调用方法，求长方形面积并打印输出
		System.out.println("长方形的面积为：" + areaDemo.area(x, y));
	}
}
