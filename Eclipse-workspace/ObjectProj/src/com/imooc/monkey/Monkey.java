package com.imooc.monkey;

public class Monkey {
    
    //���ԣ�������name����������feature��
    String name;
    String feature;

    //�޲εĹ��췽����Ĭ�ϳ�ʼ��name��feature������ֵ������ֵ�ο�Ч��ͼ��
    public Monkey() {
    	name = "��β��";
    	feature = "β�ͳ�";
    	System.out.println("����ʹ���޲ι�������ĺ��ӣ�");
    }
    
    //���εĹ��췽���������ⲿ����Ĳ������ֱ��� name �� feature ��ֵ��
    public Monkey(String name, String feature) {
    	this.name = name;
    	this.feature = feature;
    	System.out.println("����ʹ���޲ι�������ĺ��ӣ�");
    }

}
