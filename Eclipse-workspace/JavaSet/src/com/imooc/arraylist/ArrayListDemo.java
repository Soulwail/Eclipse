package com.imooc.arraylist;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
		//��ArrayList�洢ѧ�Ƶ�����
		ArrayList arr = new ArrayList();
		arr.add("����");
		arr.add("��ѧ");
		arr.add("Ӣ��");
		arr.add("��ѧ");
		arr.add("����");
		arr.add("����");
        
		//����б���Ԫ�صĸ���
		System.out.println("�б���Ԫ�صĸ���Ϊ��" + arr.size());
    
		//������������б�Ԫ��
		for (int i = 0; i < arr.size(); i++) {
		    System.out.println("��" + (i + 1)+ "��Ϊ" + arr.get(i));
		}
        
	}
}