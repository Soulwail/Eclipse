package com.imooc.monkey;

public class Test {

	public static void main(String[] args) {
        
		//�����޲ι��췽��ʵ������
		Monkey one = new Monkey();

		//��ӡ�����������
		System.out.println("���ƣ�" + one.name);
    	System.out.println("������" + one.feature);
		
		//���ô��ι��췽��ʵ������
		Monkey two = new Monkey("��ͷҶ��", "ͷ���а�ë��ϲ������Ҷ");
		
		//��ӡ�����������
		System.out.println("���ƣ�" + two.name);
    	System.out.println("������" + two.feature);
	} 

}
