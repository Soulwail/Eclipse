package com.imooc.flow1;

public class ArrayDemo {

	public static void main(String[] args) {
		//����һ���ַ�����ch����ʼ��
		char ch[] = {'a', 'b', 's', 'a', 'A', 'a'};
		int sum = 0;
		
		//ѭ���������飬ͳ���ַ���a����A�����ֵĴ���
		for(int i = 0; i < ch.length; i++) {
		    if (ch[i] == 'A' || ch[i] == 'a') {
		        sum ++;
		    }
		}
		 
		//��ӡ���ͳ������
		System.out.println("�ַ�������'a'��'A'�ĸ���Ϊ��" + sum);
		
	}

}
