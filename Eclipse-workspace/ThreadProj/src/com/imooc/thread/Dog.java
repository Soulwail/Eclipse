package com.imooc.thread;

public class Dog implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + "A dog");
		}
	}

}
