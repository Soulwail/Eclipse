package com.imooc.flow1;

public class ArrayDemo {

	public static void main(String[] args) {
		//定义一个字符数组ch并初始化
		char ch[] = {'a', 'b', 's', 'a', 'A', 'a'};
		int sum = 0;
		
		//循环遍历数组，统计字符’a’或’A’出现的次数
		for(int i = 0; i < ch.length; i++) {
		    if (ch[i] == 'A' || ch[i] == 'a') {
		        sum ++;
		    }
		}
		 
		//打印输出统计数据
		System.out.println("字符数组中'a'或'A'的个数为：" + sum);
		
	}

}
