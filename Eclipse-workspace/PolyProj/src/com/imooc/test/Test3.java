package com.imooc.test;

import com.imooc.play.*;

public class Test3 {

	public static void main(String[] args) {
		
		// 完成成员内部类内部测试
		BallTest.Inner_m play = new BallTest().new Inner_m();
		play.play();
		
		// 完成方法内部类测试
		BallTest play2 = new BallTest();
		play2.info();
	
		// 完成匿名内部类测试
		Ball ball = new Ball() {
			public void play() {
				System.out.println("**********");
				System.out.println("匿名内部类：");
				System.out.println("打排球");
			}
		};
		ball.play();
	}

}
