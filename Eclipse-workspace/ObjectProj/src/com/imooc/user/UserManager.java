package com.imooc.user;

public class UserManager {
    // 用户信息验证的方法
    public void checkUser(User one, User two) {
    	// 判断用户名是否为空，是否一致	
    	if (one.getName().equals(two.getName())) {
    		
    	}
    	else {
    		System.out.println("用户名不一致");
    	}

    	// 判断密码是否为空，是否一致
    	if (one.getPassword().equals(two.getPassword())) {
    		
    	}
    	else {
    		System.out.println("密码不一致");
    	}
    }
}
