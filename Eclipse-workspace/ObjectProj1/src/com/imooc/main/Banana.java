package com.imooc.main;

public class Banana extends Fruits{
    // ˽�����ԣ�Ʒ�֣�variety��
    private String variety;
    
    public Banana() {
    	
    }
    
    //�������ι��췽��Ϊ�������Ը�ֵ
    public Banana(String variety) {
    	super("�̶���԰", "��������");
    	this.setVariety(variety);
    }
    
    public void setVariety(String variety) {
    	this.variety = variety;
    }
    
    public String getVariety() {
    	return this.variety;
    }

    //�����޲��޷���ֵ��advantage����������Ϊ��**����**,�������𣬿ɹ���ʳ��
    public void advantage() {
    	System.out.println(this.getVariety() + "����"+ this.getShape() +"," + this.getTaste() + "���ɹ���ʳ��");
    }
    
    //��������advantage������������color��������Ϊ��**��ɫΪ**
    public void advantage(String color) {
    	System.out.println(this.getVariety() + "��ɫΪ" + color);
    }

}
