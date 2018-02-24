package com.imooc.thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		
//		Thread c = new Thread(cat);
//		Thread d = new Thread(dog);
//		
//		c.start();
//		d.start();
		
		Letter letter = new Letter();
		Thread le = new Thread(letter);
		le.start();
	}

}
