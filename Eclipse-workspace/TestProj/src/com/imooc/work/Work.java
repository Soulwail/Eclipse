package com.imooc.work;

public class Work {
	// ���ԣ���������
	private String workName;
	
	// �޲ι��췽��
	public Work() {
		
	}
	
	// ���ι��췽������ɹ������͵ĸ�ֵ
	public Work(String workName) {
		this.setWorkName(workName);
	}
	
	
	// ���е�getWorkName����������Է�װ
	public String getWorkName() {
		return workName;
	}
	
	// ���е�setWorkName����������Է�װ
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	
	// ������������������������Ϊ�����Ĺ���
	public String method() {
		String str = "���Ĺ���";
		return str;
	}
}
