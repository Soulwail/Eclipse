package com.imooc.flow;

public class AverageDemo {
    //������Ԫ�ص�ƽ��ֵ
    public float avgArray(float[] arr) {
        
        float sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum / arr.length;
    }

	public static void main(String[] args) {
		//�������
		AverageDemo avg = new AverageDemo();
		
		//����float���͵����鲢��ʼ��
		float arr[] = {78.5f, 98.5f, 65.5f, 32.5f, 75.5f};
		
		//���÷�����ƽ��ֵ����ӡ���
		System.out.println("�����ƽ��ֵΪ��" + avg.avgArray(arr));
		
	}

}
