package com.imooc.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//定义List并添加Dog类对象
		List<Dog> dog= new ArrayList<>();
		dog.add(new Dog("巴迪"));
		dog.add(new Dog("豆豆"));
	    
		//定义List并添加Cat类对象
		List<Cat> cat=new ArrayList<>();
		cat.add(new Cat("花花"));
		cat.add(new Cat("凡凡"));
    
    
		//使用AnimalPlay类的方法，按照演示效果输出内容
		AnimalPlay animalPlay=new AnimalPlay();
		animalPlay.animal(dog);
		animalPlay.animal(cat);
		
	}

}
