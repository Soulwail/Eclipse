package com.imooc.work2;

public class Tricycle extends NonMotor {
    // ���޲ι�����ʵ�ֶ���������ֵ�����޸�
	public Tricycle() {
		this.setWheel(3);
	}
	
	// ��д���з�������������Ϊ�����ֳ���һ����**�����ӵķǻ�����������**�������������ṩ
	public String work() {
		String str = "���ֳ���һ����" + this.getWheel() + "�����ӵķǻ�������";
		return str;
	}
}
