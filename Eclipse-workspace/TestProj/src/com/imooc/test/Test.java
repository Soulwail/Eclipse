package com.imooc.test;

import com.imooc.work.*;

public class Test {

    public static void main(String[] args) {
		System.out.print("������Ϣ���ԣ�");
		Work name = new Work();
		System.out.print(name.method());
		System.out.println();
	
		System.out.print("���Թ�������Ϣ���ԣ�");
		TestWork test = new TestWork(10, 5);
		System.out.print(test.method());
		System.out.println();
		
		System.out.print("�з���������Ϣ���ԣ�");
		DevelopmentWork development = new DevelopmentWork(1000, 10);
		System.out.print(development.method());
		System.out.println();
	
	}

}
