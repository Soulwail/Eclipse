package com.imooc.student;

public class Student {
	// �����������Student��Ķ���
	private int stuId;
	private String name;
	private float score;
	
	public Student() {
		
	}
	
	public Student(int stuId, String name, float score) {
		this.setStuId(stuId);
		this.setName(name);
		this.setScore(score);
	}
	
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	public int getStuId() {
		return this.stuId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(float score) {
		this.score = score;
	}
	
	public float getScore() {
		return this.score;
	}

	@Override
	public String toString() {
		return "[ѧ�ţ�" + this.stuId + ", ������" + this.name + ", �ɼ���" + this.score + "]";
	}
	
	
	
	
	
	
}
