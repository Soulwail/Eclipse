package com.imooc;

import java.util.Scanner;

public class Demo {
	
	// 插入数据
	public int[] insertData() {
		
		int arr[] = new int[10];
		for (int i = 0; i < 9; i++) {
			
			do {
				System.out.println("请输入第" + (i + 1) + "个数据：");
				Scanner sc = new Scanner(System.in);
				arr[i] = sc.nextInt();
				
				if (arr[i] == 0) {
					System.out.println("数据不能为0，请重新输入。");
				}
				
			} while(arr[i] == 0);
		}
		
		return arr;
	}
	
	// 显示所有数据
	public void showData(int[] a, int length) {
		
		if (length == 0) {
			System.out.println("请插入数据后再试。");
		}
		else {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
			
			System.out.println();
		}
	}
	
	// 在指定位置插入数据
	public void insertAtArray(int[] a) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("请输入要插入的数据：");
			n =sc.nextInt();
			
			if(n ==  0) {
				System.out.println("数据不能为0，请重新输入。");
			}
		} while(n == 0);
		
		System.out.println("请输入要插入数据的位置：");
		int k = sc.nextInt();
		
		for (int i = a.length - 2; i >= 0; i--) {
			if (i >= k - 1) {
				int temp = a[i + 1];
				a[i + 1] = a[i];
				a[i] = temp;
			}
		}
		
		a[k-1] = n;
	}
	
	// 查询能被3整除的数据
	public void divThree(int[] a) {
		
		int n = 0;
		System.out.print("数组中能被3整除的元素为：");
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i] != 0) && (a[i] % 3 == 0)) {
				System.out.print(a[i] + " ");
				n++;
			}
		}
		
		if (n == 0) {
			System.out.print("空");
		}
		
		System.out.println();
	}
		
	// 显示提示信息
	public void notice() {
		
		System.out.println("*********************************");
		System.out.println("        1--插入数据");
		System.out.println("        2--显示所有数据");
		System.out.println("        3--在指定位置处插入数据");
		System.out.println("        4--查询能被3整除的数据");
		System.out.println("        0--退出");
		System.out.println("*********************************");

	}

	public static void main(String[] args) {
		
		Demo order = new Demo();
		
		int x;
		int arr[] = new int[10];
		
		do {
			
			order.notice();								// 调用提示信息
			
			do {
				System.out.println("请输入对应的数字进行操作：");
				Scanner sc = new Scanner(System.in);
				x = sc.nextInt();
				if (x < 0 || x > 4) {					// 对操作数字进行判断
					System.out.println("请输入0~4之间的数字");
				}
			} while (x < 0 || x > 4);
			int m;
			
			switch (x) {
			case 0: System.out.println("退出程序！");		break; 	// 退出程序
			case 1: 
				arr = order.insertData();						// 调用插入数据方法
				order.showData(arr, 9);					break;	// 调用显示所有数据方法
			case 2:	
				if (arr[0] == 0) m = 0;							// 判断显示数据的长度
				else if (arr[9] == 0) m = 9;
				else m = 10;
				order.showData(arr, m);					break;	// 调用显示所有数据方法
			case 3: 
				order.insertAtArray(arr);						// 调用指定位置处插入数据方法
				order.showData(arr, 10);				break;	// 调用显示所有数据方法
			case 4: order.divThree(arr);				break;	// 调用查询能被3整除的数据方法
			}
		} while (x != 0);

	}

}
