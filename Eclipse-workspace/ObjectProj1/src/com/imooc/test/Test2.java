package com.imooc.test;

import com.imooc.main.*;

public class Test2 {

	public static void main(String[] args) {
		//ʵ����������󣬲�����������ͬ������ֵ
		Car car1 = new Car("��ɫ","����");
		Car car2 = new Car("��ɫ","����");

		//���ø���use����
		car1.use();

		//ͨ����дequals�������Ƚ����������Ƿ����
		System.out.println("car1��car2�����ñȽϣ�" + car1.equals(car2));


		System.out.println("==================================");
        //ʵ��������Taxi���󣬲���������ֵ
		Taxi taxi = new Taxi("����");

		//����ride��use����
		System.out.println(taxi.ride());
		taxi.use();
		
		//�����дtoString���taxi��Ϣ
		System.out.println(taxi.toString());

		System.out.println("==================================");
		//ʵ��������HomeCar���󣬲���������ֵ
		HomeCar homeCar = new HomeCar(7);

		//����display�������������ط���
		homeCar.display();
		homeCar.displaly(5);
		
	}

}
