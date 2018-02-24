package com.imooc.thread;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("打印机正在打印" + i);
		}
	}
}
