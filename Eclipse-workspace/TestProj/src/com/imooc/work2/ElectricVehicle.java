package com.imooc.work2;

public class ElectricVehicle extends NonMotor {
    // ˽�����ԣ����Ʒ��
	private String battery;
	
	public ElectricVehicle() {
		
	}
	
    // ���е�get***/set***����������Է�װ
	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	public String getBattery() {
		return battery;
	}

	// ��д���з�������������Ϊ������һ��ʹ��**�Ƶ�صĵ綯��������**�������������ṩ
	public String work() {
		String str = "����һ��ʹ��" + this.getBattery() + "�Ƶ�صĵ綯����";
		return str;
	}
}
