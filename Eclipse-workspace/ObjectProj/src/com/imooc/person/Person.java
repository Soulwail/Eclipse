package com.imooc.person;

/**
 * Person
 * @author 87945
 *
 */
public class Person {
    //���ԣ�name��age��grade
    String name;
    int age;
    String grade;

    //�����޲��޷���ֵ��student����������Ϊ������һ��ѧ����
	public void student() {
	    System.out.println("����һ��ѧ����");
	}


    //�������Σ��Ա�sex����sex����������Ϊ������һ��**����
	public void sex(String sex) {
	    System.out.println("����һ��" + sex + "����");
	}


    //�����޲��޷���ֵ��mySelf�������ֱ����������name�������䣨age�����꼶��grade��
    public void mySelf() {
        System.out.println("�ҽ�" + name + "������" + age + "���ˣ���Сѧ" + grade + "�꼶�ˡ�");
    }
}
