package com.imooc.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.imooc.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// 定义三个Student类的对象及一个HashSet类的对象
		Student one = new Student(1, "Tom", 87.0f);
		Student two = new Student(2, "Lucy", 95.0f);
		Student three = new Student(3, "William", 65.0f);
		

		// 将Student类的对象添加到集合中
		Set set= new HashSet();
		set.add(one);
		set.add(two);
		set.add(three);

		// 使用迭代器显示Student类的对象中的内容
		Iterator it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
