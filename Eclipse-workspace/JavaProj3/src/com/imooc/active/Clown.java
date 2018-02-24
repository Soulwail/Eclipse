package com.imooc.active;

public class Clown implements IAct {
	
	// 属性：名字、艺龄
	private String name;
	private int year;
	
	// 无参构造方法
	public Clown() {
		
	}
	
	// 带参构造方法，实行对名字、艺龄属性的赋值
	public Clown(String name, int age) {
		this.setName(name);
		this.setYear(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// 接口抽象方法
	public String skill() {
		String str = "脚踩高跷，进行杂技魔术表演";
		return str;
	}
	
	public void act() {
		System.out.println("表演者：" + this.getName());
		System.out.println("年龄：" + this.getYear() + "年");
		System.out.println("爱好：" + this.dress());
		System.out.println("技能：" + this.skill());
	}
	
	// 着装方法
	public String dress() {
		String str = "身穿五彩服装，头上戴着彩色的帽子，脸上画面夸张的彩妆";
		return str;
	}
}
