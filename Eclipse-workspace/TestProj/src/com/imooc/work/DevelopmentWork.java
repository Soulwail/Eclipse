package com.imooc.work;

public class DevelopmentWork {
	// ���ԣ���Ч����������Ŀǰû�н����Bug����
	private int line;
	private int bugNum;
	
	//��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	Work name = new Work("�з�������");
	
	public DevelopmentWork() {
		
	}
	
	public DevelopmentWork(int line, int bugNum) {
		this.setLine(line);
		this.setBugNum(bugNum);
	}
	
	// ���е�get***/set***����������Է�װ
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
	
	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**�д��룬Ŀǰ��Ȼ��**��bugû�н��������**�������������ṩ
	public String method() {
		String str = name.getWorkName() + "���ձ��ǣ������д��" + this.getLine() + "�д��룬Ŀǰ��Ȼ��" + this.getBugNum() + "��bugû�н����";
		return str;
	}
}
