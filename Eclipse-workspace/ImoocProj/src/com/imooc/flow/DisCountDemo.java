package com.imooc.flow;

public class DisCountDemo {

	//������Ʒ�ܼ�����ۺ��ܼ�
	public double price(double a) {
		double dis;
		
		if (a >= 0 && a < 100) {
			dis = a;
		}
		else if (a < 200) {
			dis = a * 0.95;
		}
		else {
			dis = a * 0.85;
		}
		return dis;
	}
	
	public static void main(String[] args) {
		//�������
		DisCountDemo dis= new DisCountDemo();
		
		//������Ʒ�ܼ۴�ŵ�������
		int price = -5;

		//���÷���������ۺ���Ʒ�ܼ�	
		System.out.println("�ۺ���Ʒ�ܼ�Ϊ��" + dis.price(price));
	}

}
