package com.imooc.active;

public class Monkey extends Animal implements IAct {
	
	// 属性：品种
	private String type;
	
	// 无参构造方法
	public Monkey() {
		
	}
	
	// 带参构造方法，实现对品种的赋值
	public Monkey(String type) {
		super("Tom", 1);
		this.setType(type);
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	// 接口抽象方法
	public String skill() {
		String str = "骑独轮车过独木桥";
		return str;
	}
	
	public void act() {
		System.out.println("表演者：" + this.getName());
		System.out.println("年龄：" + this.getAge() + "岁");
		System.out.println("品种：" + this.getType());
		System.out.println("技能：" + this.skill());
		System.out.println("爱好：" + this.love());	
	}
	
	// 父类抽象方法
	public String love() {
		String str = "喜欢模仿人的动作表情";
		return str;
	}
}
