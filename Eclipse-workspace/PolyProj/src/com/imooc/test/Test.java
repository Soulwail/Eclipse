package com.imooc.test;

import com.imooc.animal.*;

public class Test {

	public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal obj[] = new Animal[5];
		
		//产生随机数，随机产生三种具体子类的实例
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal sheep = new Sheep();
	        
        for (int i = 0; i < obj.length; i++) {
        	
        	int n;
        	
        	// 获取0~2的随机数
        	do {
        		n = (int)(Math.random() * 10);
        	} while(n < 0 || n > 2);
        	
        	// 将对象存入数组
	        if (n == 0) {
	        	obj[i] = cat;
	        }
	        else if(n == 1) {
	        	obj[i] = dog;
	        }
	        else if(n == 2) {
	        	obj[i] = sheep;
	        }
        }
        
        //循环输出，循环体中每个对象分别调用cry()方法。
        for (int i = 0; i < obj.length; i++) {
        	obj[i].cry();
        }

	}

}
