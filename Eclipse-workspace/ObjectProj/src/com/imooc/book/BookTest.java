package com.imooc.book;

public class BookTest {

    // ���Է���
	public static void main(String[] args) {
		//ʵ�������󣬵�����ط���ʵ������Ч��
		Book test = new Book("��¥��", "��ѩ��", "������ѧ������", 7.0);
		test.describe();
		System.out.println("===================");
		Book test2 = new Book("С��ɵ�", "����", "�й�����������", 55.5);
		test2.describe();
    }

}
