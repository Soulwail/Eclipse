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

			// 表演菜单展示
			System.out.println("********欢迎来到太阳马戏团********");
			System.out.println("********  请选择表演者      ********");
			System.out.println("********    1、棕熊          ********");
			System.out.println("********    2、狮子          ********");
			System.out.println("********    3、猴子          ********");
			System.out.println("********    4、鹦鹉          ********");
			System.out.println("********    5、小丑          ********");

			// 选择表演者进行表演
			int i;
			do {
				i = src.nextInt();
				if (i <= 0 || i > 5) {
					System.out.println("输入信息不正确，请重新输入");
				}
			} while (i <= 0 || i > 5);

			switch (i) {
			case 1:
				actor = new Bear();
				actor.act();
				break;
			case 2:
				actor = new Lion("灰", "公");
				actor.act();
				break;
			case 3:
				actor = new Monkey("金丝猴");
				actor.act();
				break;
			case 4:
				actor = new Parrot("牡丹鹦鹉");
				actor.act();
				break;
			case 5:
				actor = new Clown("Kahle", 5);
				actor.act();
				break;
			}

			// 选择是否继续观看表演
			System.out.println("********是否继续观看(1/0)********");
			do {
				x = src.nextInt();
				if (x < 0 || x > 1) {
					System.out.println("输入信息不正确，请重新输入");
				}
			} while (x < 0 || x > 1);

			if (x == 0) {
				System.out.println("********   欢迎下次光临     ********");
			}
		} while (x == 1);

	}

}
