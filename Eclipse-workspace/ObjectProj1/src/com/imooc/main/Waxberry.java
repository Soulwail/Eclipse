package com.imooc.main;

// Ҫ��Waxberry�಻����������
public class Waxberry extends Fruits{
    // ˽�����ԣ���ɫ��color��
    private String color;
    
	//�������췽������ɵ��ø���Ĺ��췽����������Ը�ֵ
    public Waxberry(String color) {
    	super("Բ��", "��������");
    	this.setColor(color);
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public String getColor() {
    	return this.color;
    }
    //������������д��face����������Ϊ����÷��**��**����ζ��������
    public final void face() {
    	System.out.println("��÷��" + this.getColor() + "��"+ this.getShape() +"����ζ" + this.getTaste());
    }
    
    //��д����eat����������Ϊ����÷�������У��ǳ��óԣ�
    public void eat() {
    	System.out.println("��÷�������У��ǳ��óԣ�");
    }
    
    //��дtoString����������ı�����ʽ��ͬ�����shape,color,taste��
    public String toString() {
    	String str = "��÷����Ϣ����ʵ" + this.getShape() + "��" + this.getColor() + "��" + this.getTaste() + "���ǳ��óԣ�";
    	return str;
    }
}
