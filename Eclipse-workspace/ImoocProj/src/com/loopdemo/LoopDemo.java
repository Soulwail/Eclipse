package com.loopdemo;

public class LoopDemo {

	public static void main(String[] args) {
		//�������ge��shi��bai�����ڴ�Ÿ�λ��ʮλ����λ�ϵ�����
		int ge, shi, bai;
        
		//ʹ��forѭ��
		for (int i = 200; i <= 300; i++) {
			//ȡ����λ��
			bai = i / 100;
		
			//ȡ��ʮλ��
			shi = (i / 10) % 10;
			
			//ȡ����λ��
			ge = i % 10;
		
			//������������֮��
			int pro = bai * shi * ge;
            
			//������������֮��
			int sum = bai + shi + ge;
			
            //���������42���Һ�Ϊ12�������������������
			if (pro == 42 && sum == 12) {
				System.out.println(i);
			}
 
        }
	}

}
