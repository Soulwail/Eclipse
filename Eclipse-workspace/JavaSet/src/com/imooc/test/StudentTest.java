package com.imooc.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.imooc.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// ��������Student��Ķ���һ��HashSet��Ķ���
		Student one = new Student(1, "Tom", 87.0f);
		Student two = new Student(2, "Lucy", 95.0f);
		Student three = new Student(3, "William", 65.0f);
		

		// ��Student��Ķ�����ӵ�������
		Set set= new HashSet();
		set.add(one);
		set.add(two);
		set.add(three);

		// ʹ�õ�������ʾStudent��Ķ����е�����
		Iterator it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
