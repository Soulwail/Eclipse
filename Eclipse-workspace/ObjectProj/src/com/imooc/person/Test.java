package com.imooc.person;

public class Test {

	public static void main(String[] args) {
        //ʹ��new�ؼ���ʵ��������
        Person one = new Person();
		
        //����name��age��grade�Ĳ���ֵ
	    one.name = "����";
	    one.age = 10;
	    one.grade = "��";

        //�ֱ����student��sex��mySelf����
		one.student();
		one.sex("��");
		one.mySelf();

	}

}
