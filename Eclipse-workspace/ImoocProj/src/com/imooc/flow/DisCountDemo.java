package com.imooc.flow;

public class DisCountDemo {

	//根据商品总价输出折后总价
	public double price(double a) {
		double dis;
		
		if (a >= 0 && a < 100) {
			dis = a;
		}
		else if (a < 200) {
			dis = a * 0.95;
		}
		else {
			dis = a * 0.85;
		}
		return dis;
	}
	
	public static void main(String[] args) {
		//定义对象
		DisCountDemo dis= new DisCountDemo();
		
		//定义商品总价存放到变量中
		int price = -5;

		//调用方法，输出折后商品总价	
		System.out.println("折后商品总价为：" + dis.price(price));
	}

}
