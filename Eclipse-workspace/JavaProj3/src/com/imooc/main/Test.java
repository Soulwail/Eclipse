package com.imooc.main;

import java.util.Scanner;

import com.imooc.*;
import com.imooc.active.*;

public class Test {

	public static void main(String[] args) {

		IAct actor = null;
		Scanner src = new Scanner(System.in);

		int x;
		do {

			// ���ݲ˵�չʾ
			System.out.println("********��ӭ����̫����Ϸ��********");
			System.out.println("********  ��ѡ�������      ********");
			System.out.println("********    1������          ********");
			System.out.println("********    2��ʨ��          ********");
			System.out.println("********    3������          ********");
			System.out.println("********    4������          ********");
			System.out.println("********    5��С��          ********");

			// ѡ������߽��б���
			int i;
			do {
				i = src.nextInt();
				if (i <= 0 || i > 5) {
					System.out.println("������Ϣ����ȷ������������");
				}
			} while (i <= 0 || i > 5);

			switch (i) {
			case 1:
				actor = new Bear();
				actor.act();
				break;
			case 2:
				actor = new Lion("��", "��");
				actor.act();
				break;
			case 3:
				actor = new Monkey("��˿��");
				actor.act();
				break;
			case 4:
				actor = new Parrot("ĵ������");
				actor.act();
				break;
			case 5:
				actor = new Clown("Kahle", 5);
				actor.act();
				break;
			}

			// ѡ���Ƿ�����ۿ�����
			System.out.println("********�Ƿ�����ۿ�(1/0)********");
			do {
				x = src.nextInt();
				if (x < 0 || x > 1) {
					System.out.println("������Ϣ����ȷ������������");
				}
			} while (x < 0 || x > 1);

			if (x == 0) {
				System.out.println("********   ��ӭ�´ι���     ********");
			}
		} while (x == 1);

	}

}
