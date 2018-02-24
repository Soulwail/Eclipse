package com.imooc.demo;

import java.util.List;

public class AnimalPlay {
	
	public AnimalPlay() {
		
	}
	
	// List
	public void animal(List<? extends Animal> animal) {
		for (Animal a:animal) {
			a.play();
		}
	}
}
