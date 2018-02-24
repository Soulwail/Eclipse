package com.imooc.work;

public class Work {
	// 属性：工作名称
	private String workName;
	
	// 无参构造方法
	public Work() {
		
	}
	
	// 带参构造方法，完成工作类型的赋值
	public Work(String workName) {
		this.setWorkName(workName);
	}
	
	
	// 公有的getWorkName方法完成属性封装
	public String getWorkName() {
		return workName;
	}
	
	// 公有的setWorkName方法完成属性封装
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	
	// 方法：工作描述，描述内容为：开心工作
	public String method() {
		String str = "开心工作";
		return str;
	}
}
