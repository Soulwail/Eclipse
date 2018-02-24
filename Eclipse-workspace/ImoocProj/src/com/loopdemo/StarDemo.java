package com.loopdemo;

public class StarDemo {

	public static void main(String[] args) {
		// 输出星号组成的梯形
		int x = 6;
		
		for (int i = 1; i <= x; i++) {
			
			for (int n = 1; n <= x - i; n++) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i * 2 + 1; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}

	}

}
