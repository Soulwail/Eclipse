package com.imooc.active;

public class Lion extends Animal implements IAct {
	
	// 属性：颜色、性别
	private String color;
	private String sex;
	
	// 无参构造方法
	public Lion() {
		
	}
	
	// 带参构造方法，实现对颜色、性别属性的赋值
	public Lion(String color, String sex) {
		super("Lain", 2);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// 性别判断
	public void setSex(String sex) {
		if (!sex.equals("公") || !sex.equals("母")) {
			sex = "公";
		}
		
		this.sex = sex;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	// 接口抽象方法
	public String skill() {
		String str = "擅长钻火圈";
		return str;
	}
	
	public void act() {
		System.out.println("表演者：" + this.getName());
		System.out.println("年龄：" + this.getAge() + "岁");
		System.out.println("性别：" + this.getSex() + "狮");
		System.out.println("毛色：" + this.getColor() + "色");
		System.out.println("技能：" + this.skill());
		System.out.println("爱好：" + this.love());
	}
	
	// 父类抽象方法
	@Override
	public String love() {
		String str = "喜欢吃各种肉类";
		return str;
	}
}
