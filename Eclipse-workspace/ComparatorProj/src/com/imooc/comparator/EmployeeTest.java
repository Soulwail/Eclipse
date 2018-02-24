package com.imooc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// ����Employee��Ķ���
		Employee staff1 = new Employee("emp001", "����", 1800);
		Employee staff2 = new Employee("emp002", "����", 2500);
		Employee staff3 = new Employee("emp003", "����", 1600);

		// ���������ӵ�List��
		List<Employee> list = new ArrayList<Employee>();
		list.add(staff1);
		list.add(staff2);
		list.add(staff3);

		// �������ǰ������
		System.out.println("����ǰ��");
		for (Employee l : list) {
			System.out.println(l);
		}

		// ����
		Collections.sort(list);

		// �������������
		System.out.println("�����");
		for (Employee l : list) {
			System.out.println(l);
		}
	}

}