package com.imooc.flow1;

import java.util.Scanner;

public class ScoreDemo {
	
	public static void main(String[] args) {
		//����һ���������е����Ͷ�ά����intArray
		int intArray[][] = new int[3][2];
		int i = 0,
			mathSum = 0,
			yuwenSum = 0;

		//�Ӽ�������ѧ���ɼ���Ҫ������˳����Ч��ͼһ��
		for (i = 0; i < intArray.length; i++) {
			
			System.out.println("�������" + (i + 1) + "��ѧ�������ĳɼ���");
			Scanner x = new Scanner(System.in);
			intArray[i][0] = x.nextInt();
				
			System.out.println("�������" + (i + 1) + "��ѧ������ѧ�ɼ���");
			Scanner y = new Scanner(System.in);
			intArray[i][1] = y.nextInt();
			
		}


		//�����ĵ��ܳɼ���ƽ����
		for (i = 0; i < intArray.length; i++) {
			yuwenSum += intArray[i][0];
		}
		System.out.println("���ĵ��ܳɼ�Ϊ��" + yuwenSum);
		System.out.println("���ĵ�ƽ����Ϊ��" + yuwenSum/intArray.length);


		//����ѧ���ܳɼ���ƽ����
		for (i = 0; i < intArray.length; i++) {
			mathSum += intArray[i][1];
		}
		System.out.println("���ĵ��ܳɼ�Ϊ��" + mathSum);
		System.out.println("���ĵ�ƽ����Ϊ��" + mathSum/intArray.length);

	}

}
