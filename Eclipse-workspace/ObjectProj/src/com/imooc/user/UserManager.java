package com.imooc.user;

public class UserManager {
    // �û���Ϣ��֤�ķ���
    public void checkUser(User one, User two) {
    	// �ж��û����Ƿ�Ϊ�գ��Ƿ�һ��	
    	if (one.getName().equals(two.getName())) {
    		
    	}
    	else {
    		System.out.println("�û�����һ��");
    	}

    	// �ж������Ƿ�Ϊ�գ��Ƿ�һ��
    	if (one.getPassword().equals(two.getPassword())) {
    		
    	}
    	else {
    		System.out.println("���벻һ��");
    	}
    }
}
