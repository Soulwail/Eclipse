package com.imooc.test;

import com.imooc.work.*;

public class Test {

    public static void main(String[] args) {
		System.out.print("父类信息测试：");
		Work name = new Work();
		System.out.print(name.method());
		System.out.println();
	
		System.out.print("测试工作类信息测试：");
		TestWork test = new TestWork(10, 5);
		System.out.print(test.method());
		System.out.println();
		
		System.out.print("研发工作类信息测试：");
		DevelopmentWork development = new DevelopmentWork(1000, 10);
		System.out.print(development.method());
		System.out.println();
	
	}

}
