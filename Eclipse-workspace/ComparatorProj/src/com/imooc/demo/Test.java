package com.imooc.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//����List�����Dog�����
		List<Dog> dog= new ArrayList<>();
		dog.add(new Dog("�͵�"));
		dog.add(new Dog("����"));
	    
		//����List�����Cat�����
		List<Cat> cat=new ArrayList<>();
		cat.add(new Cat("����"));
		cat.add(new Cat("����"));
    
    
		//ʹ��AnimalPlay��ķ�����������ʾЧ���������
		AnimalPlay animalPlay=new AnimalPlay();
		animalPlay.animal(dog);
		animalPlay.animal(cat);
		
	}

}
