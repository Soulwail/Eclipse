package com.imooc.employee;

import java.util.List;
import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		// ����ArrayList����
		ArrayList arrayList = new ArrayList();

		// ��������Employee��Ķ���
		Employee one = new Employee(1, "����", 5000.0);
		Employee two = new Employee(2, "����", 5500.0);
		Employee three = new Employee(3, "����", 4000.0);

		// ���Ա����Ϣ��ArrayList��
		arrayList.add(one);
		arrayList.add(two);
		arrayList.add(three);

		// ��ʾԱ����������н��
		System.out.println("Ա������" + "   " + "Ա��н��");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(((Employee) (arrayList.get(i))).getName() + "          "
					+ ((Employee) (arrayList.get(i))).getSalary());
		}
	}

}
