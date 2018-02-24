package com.imooc.arraylist;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
		//用ArrayList存储学科的名称
		ArrayList arr = new ArrayList();
		arr.add("语文");
		arr.add("数学");
		arr.add("英语");
		arr.add("化学");
		arr.add("物理");
		arr.add("生物");
        
		//输出列表中元素的个数
		System.out.println("列表中元素的个数为：" + arr.size());
    
		//遍历输出所有列表元素
		for (int i = 0; i < arr.size(); i++) {
		    System.out.println("第" + (i + 1)+ "个为" + arr.get(i));
		}
        
	}
}