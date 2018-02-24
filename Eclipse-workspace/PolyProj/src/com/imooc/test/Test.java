package com.imooc.test;

import com.imooc.animal.*;

public class Test {

	public static void main(String[] args) {
        //���ɸ����������,���鳤��Ϊ5
        Animal obj[] = new Animal[5];
		
		//���������������������־��������ʵ��
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal sheep = new Sheep();
	        
        for (int i = 0; i < obj.length; i++) {
        	
        	int n;
        	
        	// ��ȡ0~2�������
        	do {
        		n = (int)(Math.random() * 10);
        	} while(n < 0 || n > 2);
        	
        	// �������������
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
        
        //ѭ�������ѭ������ÿ������ֱ����cry()������
        for (int i = 0; i < obj.length; i++) {
        	obj[i].cry();
        }

	}

}
