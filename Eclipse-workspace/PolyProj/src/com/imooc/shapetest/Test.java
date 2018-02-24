package com.imooc.shapetest;

import com.imooc.shape.*;

public class Test {

	public static void main(String[] args) {
	    // 创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
		Shape circle = new Circle(3.5);
		Shape rectangle = new Rectangle(5, 6);
		
		// 调用area（）方法，输出结果
		circle.area();
		rectangle.area();
 
	}

}
