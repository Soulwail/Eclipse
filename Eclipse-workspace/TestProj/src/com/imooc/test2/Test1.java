package com.imooc.test2;

import com.imooc.work.Person;

public class Test1 {

	public static void main(String[] args) {
        //ʵ�������󣬴�������ֵ������, ��,18��
	    Person person = new Person("����", 18, "��");
	    
        //��ӡ���������Ϣ
        System.out.println(person.toString());
        System.out.println(person);
	}

} 
