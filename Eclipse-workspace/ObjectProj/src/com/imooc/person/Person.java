package com.imooc.person;

/**
 * Person
 * @author 87945
 *
 */
public class Person {
    //属性：name、age、grade
    String name;
    int age;
    String grade;

    //创建无参无返回值的student方法，描述为：我是一名学生！
	public void student() {
	    System.out.println("我是一名学生！");
	}


    //创建带参（性别sex）的sex方法，描述为：我是一个**孩！
	public void sex(String sex) {
	    System.out.println("我是一名" + sex + "孩！");
	}


    //创建无参无返回值的mySelf方法，分别介绍姓名（name），年龄（age），年级（grade）
    public void mySelf() {
        System.out.println("我叫" + name + "，今年" + age + "岁了，读小学" + grade + "年级了。");
    }
}
