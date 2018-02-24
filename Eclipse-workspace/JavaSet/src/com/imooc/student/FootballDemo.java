package com.imooc.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		// 定义HashMap的对象并添加数据
		Map<String, String> football = new HashMap<String, String>();
		football.put("2014", "德国");
		football.put("2010", "西班牙");
		football.put("2006", "意大利");
		football.put("2002", "巴西");
		football.put("1998", "法国");

		// 使用迭代器的方式遍历
		Iterator<String> it = football.values().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "   ");
		}

		// 使用EntrySet同时获取key和value
		System.out.println();
		Set<Entry<String, String>> entrySet=football.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.print(entry.getKey()+"-");
			System.out.println(entry.getValue());
		}
	}

}
