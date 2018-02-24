package com.imooc.test;

import com.imooc.message.*;
 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 职务
		Duty duty1 = new Duty("D", "经理");
		Duty duty2 = new Duty("D", "助理");
		Duty duty3 = new Duty("D", "职员");
		
		// 部门
		Department depart1 = new Department("D","人事部");
		Department depart2 = new Department("D","市场部");
		
		
		Staff staff1 = new Staff("张铭", "S001", 29, "男", duty1);
		depart1.addStaff(staff1);
		System.out.println(staff1.info());
		 
		Staff staff2 = new Staff("李艾爱", "S002", 21, "女", duty2);
		depart1.addStaff(staff2);
		System.out.println(staff2.info());
		
		Staff staff3 = new Staff("孙超", "S004", 29, "男", duty3);
		depart1.addStaff(staff3);
		System.out.println(staff3.info());
		
		Staff staff4 = new Staff("张美美", "S005", 26, "女", duty3);
		depart2.addStaff(staff4);
		System.out.println(staff4.info());
		
		Staff staff5 = new Staff("蓝迪", "S006", 37, "男", duty1);
		depart2.addStaff(staff5);
		System.out.println(staff5.info());
		
		Staff staff6 = new Staff("米莉", "S007", 24, "女", duty3);
		depart2.addStaff(staff6);
		System.out.println(staff6.info());
		
		System.out.println("人事部总共有"+ depart1.getStaffNum() +"名员工");
		System.out.println("市场部总共有"+ depart2.getStaffNum() +"名员工");
	}

}
