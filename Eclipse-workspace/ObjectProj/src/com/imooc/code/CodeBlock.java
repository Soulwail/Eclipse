package com.imooc.code;

public class CodeBlock {
    // ����CodeBlock�Ĺ����
    {
        System.out.println("CodeBlock�Ĺ����");
    }


    //����CodeBlock�ľ�̬�����
    static {
        System.out.println("CodeBlock�ľ�̬�����");
    }


    //����CodeBlock�Ĺ��췽��
    public CodeBlock() {
        System.out.println("CodeBlock�Ĺ��췽��");
    }


   public static void main(String[] args){
        //��д���������������˳�����н���μ�Ч��ͼ
	   	System.out.println("CodeBlock��������");
	   	
        System.out.println("����Code��ʵ������");	   	
        Code code = new Code();
         
        System.out.println("����CodeBlock��ʵ������");
        CodeBlock codeBlock = new CodeBlock();


        
   }
}