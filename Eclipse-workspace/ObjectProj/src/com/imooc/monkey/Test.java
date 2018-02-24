package com.imooc.monkey;

public class Test {

	public static void main(String[] args) {
        
		//调用无参构造方法实例对象
		Monkey one = new Monkey();

		//打印输出对象属性
		System.out.println("名称：" + one.name);
    	System.out.println("特征：" + one.feature);
		
		//调用带参构造方法实例对象
		Monkey two = new Monkey("白头叶猴", "头上有白毛，喜欢吃树叶");
		
		//打印输出对象属性
		System.out.println("名称：" + two.name);
    	System.out.println("特征：" + two.feature);
	} 

}
