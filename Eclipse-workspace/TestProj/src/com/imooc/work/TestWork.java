package com.imooc.work;

public class TestWork {
	// ���ԣ���д�Ĳ����������������ֵ�bug����
	private int num;
	private int bugNum;
	
	// ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	Work name = new Work("���Թ�����");
	
	public TestWork() {
		
	}
	
	public TestWork(int num, int bugNum) {
		this.setNum(num);
		this.setBugNum(bugNum);
	}
	
	// ���е�get***/set***����������Է�װ
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

	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**������������������**bug������**�������������ṩ
	public String method() {
		String str = name.getWorkName() + "���ձ��ǣ������д��" + this.getNum() + "������������������" + this.getBugNum() + "��bug��";
		return str;
	}
}
