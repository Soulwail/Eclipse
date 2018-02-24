package com.imooc.active;

public class Parrot extends Animal implements IAct {
	
	// 属性：品种
	private String type;
	
	// 无参构造方法
	public Parrot() {
		
	}
	
	// 带参构造方法
	public Parrot(String type) {
		super("Rose", 1);
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
		String str = "擅长模仿";
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
		String str = "喜欢吃坚果和松子";
		return str;
	}
}
