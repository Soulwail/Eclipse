package com.imooc.work;

public class TestWork {
	// 属性：编写的测试用例个数、发现的bug数量
	private int num;
	private int bugNum;
	
	// 编写构造方法，并调用父类相关赋值方法，完成属性赋值
	Work name = new Work("测试工作类");
	
	public TestWork() {
		
	}
	
	public TestWork(int num, int bugNum) {
		this.setNum(num);
		this.setBugNum(bugNum);
	}
	
	// 公有的get***/set***方法完成属性封装
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getBugNum() {
		return bugNum;
	}

	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}

	// 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
	public String method() {
		String str = name.getWorkName() + "的日报是：今天编写了" + this.getNum() + "个测试用例，发现了" + this.getBugNum() + "个bug。";
		return str;
	}
}
