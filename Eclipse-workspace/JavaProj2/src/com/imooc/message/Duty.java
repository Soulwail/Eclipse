package com.imooc.message;

public class Duty {
	// 成员属性：职务编号、职务名称
	private String dutyNum;
	private String dutyName;
	
	public Duty() {
	
	}
	
	public Duty(String dutyNum, String dutyName) {
		this.setDutyNum(dutyNum);
		this.setDutyName(dutyName);
	}
	
	public void setDutyNum(String dutyNum) {
		this.dutyNum = dutyNum;
	}
	
	public String getDutyNum() {
		return this.dutyNum;
	}
	
	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}
	
	public String getDutyName() {
		return this.dutyName;
	}
}
