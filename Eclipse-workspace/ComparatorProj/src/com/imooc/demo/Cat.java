package com.imooc.demo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void play() {

		System.out.println("Сè"+super.getName()+"������Ϸ��");
	}

}
