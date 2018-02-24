package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入成绩：");
		
		sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90)
			System.out.println("优");
		else if (score >= 80)
			System.out.println("良");
		else if (score >= 60)
			System.out.println("中");
		else if (score < 60)
			System.out.println("不及格");
	}

}
