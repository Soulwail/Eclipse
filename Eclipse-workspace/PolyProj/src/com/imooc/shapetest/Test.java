package com.imooc.shapetest;

import com.imooc.shape.*;

public class Test {

	public static void main(String[] args) {
	    // �������ʵ�������ֱ��Բ�İ뾶�;��εĳ�����и�ֵ
		Shape circle = new Circle(3.5);
		Shape rectangle = new Rectangle(5, 6);
		
		// ����area����������������
		circle.area();
		rectangle.area();
 
	}

}
