package com.imooc.test2;

import com.imooc.work2.*;

public class Test {

	public static void main(String[] args) {
		System.out.print("������Ϣ���ԣ�");
		NonMotor nonMotor = new NonMotor("��", "����", 4, 2);
		System.out.print(nonMotor.work());
		System.out.println();

		System.out.print("���г�����Ϣ���ԣ�");
		Bicycle bicycle = new Bicycle();
		System.out.print(bicycle.work());
		System.out.println();

		System.out.print("�綯������Ϣ���ԣ�");
		ElectricVehicle electricVehicle = new ElectricVehicle();
		electricVehicle.setBattery("�ɸ�");
		System.out.print(electricVehicle.work());
		System.out.println();

		System.out.print("���ֳ�����Ϣ���ԣ�");
		Tricycle tricycle = new Tricycle();
		System.out.print(tricycle.work());
		System.out.println();
	
	}

}
