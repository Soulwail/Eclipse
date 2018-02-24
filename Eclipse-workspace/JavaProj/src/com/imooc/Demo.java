package com.imooc;

import java.util.Scanner;

public class Demo {
	
	// ��������
	public int[] insertData() {
		
		int arr[] = new int[10];
		for (int i = 0; i < 9; i++) {
			
			do {
				System.out.println("�������" + (i + 1) + "�����ݣ�");
				Scanner sc = new Scanner(System.in);
				arr[i] = sc.nextInt();
				
				if (arr[i] == 0) {
					System.out.println("���ݲ���Ϊ0�����������롣");
				}
				
			} while(arr[i] == 0);
		}
		
		return arr;
	}
	
	// ��ʾ��������
	public void showData(int[] a, int length) {
		
		if (length == 0) {
			System.out.println("��������ݺ����ԡ�");
		}
		else {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
			
			System.out.println();
		}
	}
	
	// ��ָ��λ�ò�������
	public void insertAtArray(int[] a) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("������Ҫ��������ݣ�");
			n =sc.nextInt();
			
			if(n ==  0) {
				System.out.println("���ݲ���Ϊ0�����������롣");
			}
		} while(n == 0);
		
		System.out.println("������Ҫ�������ݵ�λ�ã�");
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
	
	// ��ѯ�ܱ�3����������
	public void divThree(int[] a) {
		
		int n = 0;
		System.out.print("�������ܱ�3������Ԫ��Ϊ��");
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i] != 0) && (a[i] % 3 == 0)) {
				System.out.print(a[i] + " ");
				n++;
			}
		}
		
		if (n == 0) {
			System.out.print("��");
		}
		
		System.out.println();
	}
		
	// ��ʾ��ʾ��Ϣ
	public void notice() {
		
		System.out.println("*********************************");
		System.out.println("        1--��������");
		System.out.println("        2--��ʾ��������");
		System.out.println("        3--��ָ��λ�ô���������");
		System.out.println("        4--��ѯ�ܱ�3����������");
		System.out.println("        0--�˳�");
		System.out.println("*********************************");

	}

	public static void main(String[] args) {
		
		Demo order = new Demo();
		
		int x;
		int arr[] = new int[10];
		
		do {
			
			order.notice();								// ������ʾ��Ϣ
			
			do {
				System.out.println("�������Ӧ�����ֽ��в�����");
				Scanner sc = new Scanner(System.in);
				x = sc.nextInt();
				if (x < 0 || x > 4) {					// �Բ������ֽ����ж�
					System.out.println("������0~4֮�������");
				}
			} while (x < 0 || x > 4);
			int m;
			
			switch (x) {
			case 0: System.out.println("�˳�����");		break; 	// �˳�����
			case 1: 
				arr = order.insertData();						// ���ò������ݷ���
				order.showData(arr, 9);					break;	// ������ʾ�������ݷ���
			case 2:	
				if (arr[0] == 0) m = 0;							// �ж���ʾ���ݵĳ���
				else if (arr[9] == 0) m = 9;
				else m = 10;
				order.showData(arr, m);					break;	// ������ʾ�������ݷ���
			case 3: 
				order.insertAtArray(arr);						// ����ָ��λ�ô��������ݷ���
				order.showData(arr, 10);				break;	// ������ʾ�������ݷ���
			case 4: order.divThree(arr);				break;	// ���ò�ѯ�ܱ�3���������ݷ���
			}
		} while (x != 0);

	}

}
