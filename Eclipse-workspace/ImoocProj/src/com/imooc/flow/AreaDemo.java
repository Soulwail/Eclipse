package com.imooc.flow;

public class AreaDemo {
    //��Բ�����
	public double area(double x) {
		return Math.PI * (x * x);
	}
    
	//�󳤷������
	public double area(double x, double y) {
		return x * y;
	}

	public static void main(String[] args) {
		//�������
		AreaDemo areaDemo = new AreaDemo();
		
		//����һ��double���͵ı�����Ű뾶������ʼ��
		double r = 4.5;
		
		//��������������ų��Ϳ�����ʼ��
		double x = 8, y = 5;
		
		//���÷�������Բ���������ӡ���
		System.out.println("Բ�����Ϊ��" + areaDemo.area(r));
		
		//���÷������󳤷����������ӡ���
		System.out.println("�����ε����Ϊ��" + areaDemo.area(x, y));
	}
}
