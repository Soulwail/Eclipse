package com.imooc.flow1;

import java.util.Scanner;

public class ScoreDemo {
	
	public static void main(String[] args) {
		//定义一个三行两列的整型二维数组intArray
		int intArray[][] = new int[3][2];
		int i = 0,
			mathSum = 0,
			yuwenSum = 0;

		//从键盘输入学生成绩，要求输入顺序与效果图一致
		for (i = 0; i < intArray.length; i++) {
			
			System.out.println("请输入第" + (i + 1) + "个学生的语文成绩：");
			Scanner x = new Scanner(System.in);
			intArray[i][0] = x.nextInt();
				
			System.out.println("请输入第" + (i + 1) + "个学生的数学成绩：");
			Scanner y = new Scanner(System.in);
			intArray[i][1] = y.nextInt();
			
		}


		//求语文的总成绩和平均分
		for (i = 0; i < intArray.length; i++) {
			yuwenSum += intArray[i][0];
		}
		System.out.println("语文的总成绩为：" + yuwenSum);
		System.out.println("语文的平均分为：" + yuwenSum/intArray.length);


		//求数学的总成绩和平均分
		for (i = 0; i < intArray.length; i++) {
			mathSum += intArray[i][1];
		}
		System.out.println("语文的总成绩为：" + mathSum);
		System.out.println("语文的平均分为：" + mathSum/intArray.length);

	}

}
