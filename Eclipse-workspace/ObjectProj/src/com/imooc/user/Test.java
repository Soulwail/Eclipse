package com.imooc.user;

public class Test {

	public static void main(String[] args) {
	     //ʵ�������󣬵�����ط���ʵ������Ч��
	     User user1 = new User();
	     user1.setName("Lucy");
	     user1.setPassword("123456");
	     
	     User user2 = new User();
	     user2.setName("Mike");
	     user2.setPassword("123452");
	     
	     user1.message();
	     user2.message();
	     
	     System.out.println("===========");
	     UserManager manager = new UserManager();
	     manager.checkUser(user1, user2);
	}

}
