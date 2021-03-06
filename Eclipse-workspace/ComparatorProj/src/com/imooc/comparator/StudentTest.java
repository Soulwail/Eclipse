package com.imooc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	// 实现接口中的方法
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
		// 定义Student类的对象
		Student stu1 = new Student(40, "peter", 20);
		Student stu2 = new Student(28, "angle", 5);
		Student stu3 = new Student(35, "tom", 18);

		// 将对象添加到List中
		List<Student> list = new ArrayList();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		// 输出排序前的数据
		System.out.println("按名字排序前：");
		for (Student l : list) {
			System.out.println(l);
		}

		// 排序
		Collections.sort(list, new Name());
		
		// 输出排序后的数据
		System.out.println("按名字排序后：");
		for (Student l : list) {
			System.out.println(l);
		}
		
	}

}
