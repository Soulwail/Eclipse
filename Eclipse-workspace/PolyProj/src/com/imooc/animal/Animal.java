package com.imooc.animal;

public class Animal {
    //���ԣ�kind(����)
	private String kind;
	
	public Animal(){
		
	}
    
	//�������Σ�kingΪ���������캯��
	public Animal(String kind) {
		this.setKind(kind);
	}

    //Ӧ�÷�װʵ�ֶ�˽�����Ե�get/set����
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return this.kind;
	}
	
	
	//������Ա����cry():void
	public void cry() {
		
	}

}
