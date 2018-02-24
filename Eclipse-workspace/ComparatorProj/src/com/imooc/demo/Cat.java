package com.imooc.demo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void play() {

		System.out.println("小猫"+super.getName()+"在做游戏！");
	}

}
