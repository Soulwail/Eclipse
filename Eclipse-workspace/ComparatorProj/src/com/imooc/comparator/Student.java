package com.imooc.comparator;

public class Student {
    //��Ա����
    private int id;
    private String name;
    private int age;
    
    //���췽��
    public Student(int id, String name, int age){
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }
    
    //getter��setter����
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    //toString()����
    public String toString(){
        return "[ѧ�ţ�"+ this.getId() + "�����䣺" + this.getAge() + "��������" + this.getName() + "]";
    }
}
