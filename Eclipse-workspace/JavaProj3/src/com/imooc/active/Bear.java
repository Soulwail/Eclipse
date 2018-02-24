package com.imooc.active;

public class Bear extends Animal implements IAct {
	
	// 无参构造方法
	public Bear() {
		super("Bill", 1);
	}
	
	public String skill() {
		String str = "挽着花篮，打着雨伞，自立走秀";
		return str;
		
	}
	
	public void act() {
		System.out.println("表演者：" + this.getName());
		System.out.println("年龄：" + this.getAge() + "岁");
		System.out.println("技能：" + this.skill());
		System.out.println("爱好：" + this.love());
		
	}
	
	// 父类抽象方法
	@Override
	public String love() {
		String str = "喜欢卖萌";
		return str;
	}
}
