package com.imooc.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		//�������ͱ���n��Ϊѭ������������ʼ��
		int n = 1;

        //�������ͱ���sum��źͣ�����ʼ��
        int sum = 0;

        //ʹ��whileѭ����1��5��ƽ����
        while (n <= 5) {
            sum += n * n;
            n++;
        }
        
        //���ƽ����
        System.out.println("1��5��ƽ����Ϊ��" + sum);
        
		
	}

}
