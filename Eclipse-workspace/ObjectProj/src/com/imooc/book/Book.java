package com.imooc.book;

public class Book {
	//私有属性：书名、作者、出版社、价格
	private String bookName;
	private String author;
	private String press;
	private double price;

	//通过构造方法实现属性赋值
	public Book(String bookName, String author, String press, double price) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.setPrice(price);
	} 
	
	/*通过公有的get/set方法实现属性的访问，其中：
	1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
	2、限定作者、书名均为只读属性
	 */
	
	// 书名
	public String getBookName() {
		return bookName;
	}
	
	// 作者
	public String getAuthor() {
		return author;
	}

	// 出版社
	public void setPress(String press) {
		this.press = press;
	}
	
	public String getPress() {
		return press;
	}

	// 价格
	public void setPrice(double price) {
		if (price < 10.0) {
			System.out.println("图书价格最低为10元");
			this.price = 10.0;
		}
		else
			this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	//信息介绍方法，描述图书所有信息
	public void describe() {
		System.out.println("书名：" + this.getBookName());
		System.out.println("作者：" + this.getAuthor());
		System.out.println("出版社：" + this.getPress());
		System.out.println("价格：" + this.getPrice());
	}

}
