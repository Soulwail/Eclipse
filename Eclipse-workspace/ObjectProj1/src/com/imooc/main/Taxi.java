package com.imooc.main;

public class Taxi extends Car{
    //˽�����ԣ�������˾( company)
	private String company;

	public Taxi(){
		
	}
	
	//���ø���Ĺ��췽����������Ը�ֵ
    public Taxi(String company) {
    	super("��","��СȪ");
    	this.setCompany(company);
    }
	
    //ͨ����װʵ�ֶ�˽�����Ե�get/set����
    public void setCompany(String company) {
    	this.company = company;
    }
    
    public String getCompany() {
    	return this.company;
    }

	//������������д��ride����������Ϊ��**���⳵��������***��˾�ġ�
	public final String ride() {
		String str = "���⳵��������" + this.getCompany() + "��˾�ġ�";
		return str;
	}

	//��д����use����������Ϊ�����⳵���������������������Ҫ����֮һ
	public void use() {
		System.out.println("���⳵���������������������Ҫ����֮һ");
	}

	//��дtoString����������ı�����ʽ��ͬ�����color,userName��
	public String toString() {
		String str = "taxi����Ϣ�ǣ�" + this.getUserName() + "ӵ��һ��" + this.getColor() + "ɫ�ĳ��⳵";
		return str;
	}

}
