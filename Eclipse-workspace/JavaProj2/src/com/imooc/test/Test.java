package com.imooc.test;

import com.imooc.message.*;
 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ְ��
		Duty duty1 = new Duty("D", "����");
		Duty duty2 = new Duty("D", "����");
		Duty duty3 = new Duty("D", "ְԱ");
		
		// ����
		Department depart1 = new Department("D","���²�");
		Department depart2 = new Department("D","�г���");
		
		
		Staff staff1 = new Staff("����", "S001", 29, "��", duty1);
		depart1.addStaff(staff1);
		System.out.println(staff1.info());
		 
		Staff staff2 = new Staff("���", "S002", 21, "Ů", duty2);
		depart1.addStaff(staff2);
		System.out.println(staff2.info());
		
		Staff staff3 = new Staff("�ﳬ", "S004", 29, "��", duty3);
		depart1.addStaff(staff3);
		System.out.println(staff3.info());
		
		Staff staff4 = new Staff("������", "S005", 26, "Ů", duty3);
		depart2.addStaff(staff4);
		System.out.println(staff4.info());
		
		Staff staff5 = new Staff("����", "S006", 37, "��", duty1);
		depart2.addStaff(staff5);
		System.out.println(staff5.info());
		
		Staff staff6 = new Staff("����", "S007", 24, "Ů", duty3);
		depart2.addStaff(staff6);
		System.out.println(staff6.info());
		
		System.out.println("���²��ܹ���"+ depart1.getStaffNum() +"��Ա��");
		System.out.println("�г����ܹ���"+ depart2.getStaffNum() +"��Ա��");
	}

}
