package com.imooc.work;

public class DevelopmentWork {
	// 属性：有效编码行数、目前没有解决的Bug个数
	private int line;
	private int bugNum;
	
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	Work name = new Work("研发工作类");
	
	public DevelopmentWork() {
		
	}
	
	public DevelopmentWork(int line, int bugNum) {
		this.setLine(line);
		this.setBugNum(bugNum);
	}
	
	// 公有的get***/set***方法完成属性封装
	public void setLine(int line) {
		this.line = line;
	}
	
	public int getLine() {
		return line;
	}
	
	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	
	public int getBugNum() {
		return bugNum;
	}
	
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String method() {
		String str = name.getWorkName() + "的日报是：今天编写了" + this.getLine() + "行代码，目前仍然有" + this.getBugNum() + "个bug没有解决。";
		return str;
	}
}
