package com.imooc.demo;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void play() {

		System.out.println("С��"+super.getName()+"������Ϸ��");
	}

}
