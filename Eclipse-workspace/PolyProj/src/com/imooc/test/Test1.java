package com.imooc.test;

import com.imooc.ifly.*;

public class Test1 {

	public static void main(String[] args) {
		//����ʵ����
        IFly fly1 = new Plane();
        IFly fly2 = new Bird();
        IFly fly3 = new Balloon();

        //�ֱ����fly()����
        fly1.fly();
        fly2.fly();
        fly3.fly();

	}

}
