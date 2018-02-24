package com.imooc.test;

import com.imooc.ifly.*;

public class Test1 {

	public static void main(String[] args) {
		//对象实例化
        IFly fly1 = new Plane();
        IFly fly2 = new Bird();
        IFly fly3 = new Balloon();

        //分别调用fly()方法
        fly1.fly();
        fly2.fly();
        fly3.fly();

	}

}
