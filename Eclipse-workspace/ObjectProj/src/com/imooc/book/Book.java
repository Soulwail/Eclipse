package com.imooc.book;

public class Book {
	//˽�����ԣ����������ߡ������硢�۸�
	private String bookName;
	private String author;
	private String press;
	private double price;

	//ͨ�����췽��ʵ�����Ը�ֵ
	public Book(String bookName, String author, String press, double price) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.setPrice(price);
	} 
	
	/*ͨ�����е�get/set����ʵ�����Եķ��ʣ����У�
	1���޶�ͼ��۸�������10�������Ч�������ʾ����ǿ�Ƹ�ֵΪ10
	2���޶����ߡ�������Ϊֻ������
	 */
	
	// ����
	public String getBookName() {
		return bookName;
	}
	
	// ����
	public String getAuthor() {
		return author;
	}

	// ������
	public void setPress(String press) {
		this.press = press;
	}
	
	public String getPress() {
		return press;
	}

	// �۸�
	public void setPrice(double price) {
		if (price < 10.0) {
			System.out.println("ͼ��۸����Ϊ10Ԫ");
			this.price = 10.0;
		}
		else
			this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	//��Ϣ���ܷ���������ͼ��������Ϣ
	public void describe() {
		System.out.println("������" + this.getBookName());
		System.out.println("���ߣ�" + this.getAuthor());
		System.out.println("�����磺" + this.getPress());
		System.out.println("�۸�" + this.getPrice());
	}

}
