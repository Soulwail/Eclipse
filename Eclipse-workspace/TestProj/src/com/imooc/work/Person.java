package com.imooc.work;

public class Person {
    //˽�����ԣ�name����������age(����)��sex���Ա�
    private String name;
    private int age;
    private String sex;


    //���ι��췽����name��age��sexΪ������
    public Person(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }
    
    //ͨ����װʵ�ֶ����Ե�get/set�����趨
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getSex() {
        return sex;
    }


    //��дtoString��������ʾ��ʽΪ��������+**+  ���䣺+**+  �Ա�+**
	public String toString() {
	    String str = "������" + this.getName() + "  ���䣺" + this.getAge() + "  �Ա�" + this.getSex();
	    return str;
	}
}
