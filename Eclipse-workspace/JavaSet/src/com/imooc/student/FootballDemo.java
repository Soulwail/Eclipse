package com.imooc.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		// ����HashMap�Ķ����������
		Map<String, String> football = new HashMap<String, String>();
		football.put("2014", "�¹�");
		football.put("2010", "������");
		football.put("2006", "�����");
		football.put("2002", "����");
		football.put("1998", "����");

		// ʹ�õ������ķ�ʽ����
		Iterator<String> it = football.values().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "   ");
		}

		// ʹ��EntrySetͬʱ��ȡkey��value
		System.out.println();
		Set<Entry<String, String>> entrySet=football.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.print(entry.getKey()+"-");
			System.out.println(entry.getValue());
		}
	}

}
