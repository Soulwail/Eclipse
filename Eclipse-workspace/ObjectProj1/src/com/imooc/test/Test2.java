package com.imooc.test;

import com.imooc.main.*;

public class Test2 {

	public static void main(String[] args) {
		//实例化父类对象，并传入两组相同的属性值
		Car car1 = new Car("白色","李四");
		Car car2 = new Car("白色","李四");

		//调用父类use方法
		car1.use();

		//通过重写equals方法，比较两个对象是否相等
		System.out.println("car1和car2的引用比较：" + car1.equals(car2));


		System.out.println("==================================");
        //实例化子类Taxi对象，并传入属性值
		Taxi taxi = new Taxi("长生");

		//调用ride和use方法
		System.out.println(taxi.ride());
		taxi.use();
		
		//输出重写toString后的taxi信息
		System.out.println(taxi.toString());

		System.out.println("==================================");
		//实例化子类HomeCar对象，并传入属性值
		HomeCar homeCar = new HomeCar(7);

		//调用display方法及它的重载方法
		homeCar.display();
		homeCar.displaly(5);
		
	}

}
