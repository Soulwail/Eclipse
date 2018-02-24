package com.imooc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	// ʵ�ֽӿ��еķ���
	public static class Name implements Comparator<Student> {
		@Override
		public int compare(Student arg0, Student arg1) {
			String name1 = arg0.getName();
			String name2 = arg1.getName();
			int n = name1.compareTo(name2);
			return n;
		}
	}

	public static void main(String[] args) {
		// ����Student��Ķ���
		Student stu1 = new Student(40, "peter", 20);
		Student stu2 = new Student(28, "angle", 5);
		Student stu3 = new Student(35, "tom", 18);

		// ���������ӵ�List��
		List<Student> list = new ArrayList();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		// �������ǰ������
		System.out.println("����������ǰ��");
		for (Student l : list) {
			System.out.println(l);
		}

		// ����
		Collections.sort(list, new Name());
		
		// �������������
		System.out.println("�����������");
		for (Student l : list) {
			System.out.println(l);
		}
		
	}

}