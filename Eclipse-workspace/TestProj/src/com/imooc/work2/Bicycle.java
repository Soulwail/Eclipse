package com.imooc.work2;

public class Bicycle extends NonMotor {
    // �ڹ��췽���е��ø����ι��죬������Ը�ֵ
	public Bicycle() {
		super("�ݰ���", "��");
	}
	
	// ��д���з�������������Ϊ������һ��**��ɫ�ģ�**�Ƶ����г�������**�������������ṩ
    public String work() {
    	String str = "����һ��" + this.getColor() + "��ɫ�ģ�" + this.getBrand() + "�Ƶ����г���";
    	return str;
    }
 
}
