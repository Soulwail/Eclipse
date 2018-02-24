package com.imooc.work2;

public class NonMotor {
    // 私有属性：品牌、颜色、轮子(默认2个)、座椅（默认 1个）
	private String brand;
	private String color;
	private int wheel = 2;
	private int seat = 1;
	
	// 无参构造方法
	public NonMotor() {
		
	}

	// 双参构造方法，完成对品牌和颜色的赋值
	public NonMotor(String brand, String color) {
		this.setBrand(brand);
		this.setColor(color);
	}

	// 四参构造方法，分别对所有属性赋值
	public NonMotor(String brand, String color, int wheel, int seat) {
		this.setBrand(brand);
		this.setColor(color);
		this.setWheel(wheel);
		this.setSeat(seat);
	}
   
	// 公有的get***/set***方法完成属性封装
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return wheel;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public int getSeat() {
		return seat;
	}
	// 方法：运行，描述内容为：这是一辆**颜色的，**牌的非机动车，有**个轮子，有**个座椅的非机动车。其中**的数据由属性提供
	public String work() {
		String str = "这是一辆" + this.brand + "颜色的，" + this.color + "牌的非机动车，有" + this.wheel + "个轮子，有" + this.seat + "个座椅的非机动车。";
		return str;
	}
}
