package com.imooc.comparator;

public class Student {
    //成员变量
    private int id;
    private String name;
    private int age;
    
    //构造方法
    public Student(int id, String name, int age){
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }
    
    //getter和setter方法
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
    
    //toString()方法
    public String toString(){
        return "[学号："+ this.getId() + "，年龄：" + this.getAge() + "，姓名：" + this.getName() + "]";
    }
}
