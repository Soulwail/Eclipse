package com.imooc.string;

public class StringDemo {

	public static void main(String[] args) {
		//����һ���ַ���"��ӭ����"
		StringBuilder str = new StringBuilder("��ӭ����");
		
		//��"��ӭ����"����������ݣ����ַ������"��ӭ����imooc"
		System.out.println(str.append("imooc"));
		
		//ʹ��delete����ɾ��"��ӭ����",Ȼ����롰��ã���
		System.out.println("ɾ�������" + str.delete(0,4).insert(0, "��ã�"));
        
		//���ַ�����ɡ���ã�imooc��
		str.replace(2, 3, "��");
		
		//ʹ��replace�����滻
		System.out.println("�滻��" + str.replace(0, 3, "��ӭ����"));
		
	}

}
 