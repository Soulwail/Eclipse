package com.imooc.test;

import com.imooc.play.*;

public class Test3 {

	public static void main(String[] args) {
		
		// ��ɳ�Ա�ڲ����ڲ�����
		BallTest.Inner_m play = new BallTest().new Inner_m();
		play.play();
		
		// ��ɷ����ڲ������
		BallTest play2 = new BallTest();
		play2.info();
	
		// ��������ڲ������
		Ball ball = new Ball() {
			public void play() {
				System.out.println("**********");
				System.out.println("�����ڲ��ࣺ");
				System.out.println("������");
			}
		};
		ball.play();
	}

}
