package com.imooc.test;

import com.imooc.main.*;

public class Test {
	public static void main(String[] args) {
		// ʵ����2��������󣬴���������ͬ�Ĳ���ֵ
		Fruits fru1 = new Fruits("Բ��", "��������");
		Fruits fru2 = new Fruits("Բ��", "��������");

		// ���ø���eat����
		fru1.eat();

		// ������дequals�������ж����������Ƿ����
		System.out.println("fru1��fru2�����ñȽϣ�" + fru1.equals(fru2));

		System.out.println("��������������������������������������������������������������������������������");
		// ʵ����������󣬲�������ز���ֵ
		Waxberry waxberry = new Waxberry("�Ϻ�ɫ");

		// ��������face������eat����
		waxberry.face();
		waxberry.eat();

		// ������дtoString�������������������Ϣ
		System.out.println(waxberry.toString());
		

		System.out.println("��������������������������������������������������������������������������������������������");
		// ʵ����Banana����󣬲�������ز���ֵ
		Banana banana = new Banana("���˽�");

		// ���������advantage���������ط���
		banana.advantage();
		banana.advantage("��ɫ");
		
	}
}
