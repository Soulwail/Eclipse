package com.imooc.test2;

import com.imooc.work2.*;

public class Test {

	public static void main(String[] args) {
		System.out.print("父类信息测试：");
		NonMotor nonMotor = new NonMotor("红", "天宇", 4, 2);
		System.out.print(nonMotor.work());
		System.out.println();

		System.out.print("自行车类信息测试：");
		Bicycle bicycle = new Bicycle();
		System.out.print(bicycle.work());
		System.out.println();

		System.out.print("电动车类信息测试：");
		ElectricVehicle electricVehicle = new ElectricVehicle();
		electricVehicle.setBattery("飞鸽");
		System.out.print(electricVehicle.work());
		System.out.println();

		System.out.print("三轮车类信息测试：");
		Tricycle tricycle = new Tricycle();
		System.out.print(tricycle.work());
		System.out.println();
	
	}

}
