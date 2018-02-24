package goods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ShoppingCart {
	private Map<String, GoodsInCart> shoppingCart = new HashMap<String, GoodsInCart>(); // ���ԣ����ﳵ

	// �޲ι��췽��
	public ShoppingCart() {

	}

	// ���ι��췽��
	public ShoppingCart(Map shoppingCart) {
		this.setShoppingCart(shoppingCart);
	}

	// getter��setter����
	public Map getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Map shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	Scanner sc = new Scanner(System.in);

	// �����������Ʒ�����ﳵ
	public void addGoodsToCart(GoodsManage gm) {

		GoodsInCart goodsInCart = new GoodsInCart();
		Iterator it = gm.getGoodsSet().iterator();
		boolean flag = false;
		Goods goods = null;

		System.out.println("������Ҫ��ӵ���Ʒ��ţ�");
		String goodsId = sc.next();
		// �ж���Ʒ�Ƿ����
		while (it.hasNext()) {
			goods = (Goods) it.next();
			if (goods.getGoodsId().equals(goodsId)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("������Ҫ��ӵ���Ʒ������");
			int num = sc.nextInt();
			goodsInCart.setGoods(goods);
			goodsInCart.setNum(num);

			String key = goodsId;
			GoodsInCart value = goodsInCart;

			shoppingCart.put(key, value);
		} else {
			System.out.println("��������ȷ����Ʒ��ţ�");
		}

	}

	// ͨ��entrySet����������Map�е����м�ֵ��
	Set<Entry<String, GoodsInCart>> entrySet = shoppingCart.entrySet();

	// �������޸Ĺ��ﳵ�е���Ʒ����
	public void updateNumInCart() {
		if (entrySet.size() == 0) {
			System.out.println("���ﳵ��û����Ʒ���빺����Ʒ������");
		} else {

			System.out.println("�޸Ĺ��ﳵ�е���Ʒ����");
			System.out.println("������Ҫ�޸ĵ���Ʒ��ţ�");
			String goodsId = sc.next();
			Set<String> keySet = shoppingCart.keySet();

			boolean flag = false;
			for (String key : keySet) {

				if (goodsId.equals(key)) {

					System.out.println("�������µ���Ʒ������");
					int newNum = sc.nextInt();

					if (newNum == 0) {
						System.out.println("��Ϊ��Ʒ����Ϊ0������Ʒ�Ѿ��ӹ��ﳵ�Ƴ���");
						shoppingCart.remove(key);
						break;
					} else {
						shoppingCart.get(key).setNum(newNum);
					}

					flag = true;
				}
			}

			if (!flag) {
				System.out.println("��������ȷ����Ʒ���!");
			}
		}
	}

	// ��������ʾ���ﳵ�е�������Ʒ
	public void displayAllInCart() {

		if (entrySet.size() == 0) {
			System.out.println("���ﳵ�ǿյ�Ӵ���Ͽ�װ����~");
		} else {
			for (Entry<String, GoodsInCart> entry : entrySet) {
				System.out.println("��Ʒ���ƣ�" + entry.getValue().getGoods().getGoodsName() + "����Ʒ�۸�"
						+ entry.getValue().getGoods().getPrice() + "����Ʒ������" + entry.getValue().getGoods().getGoodsDesp()
						+ "��������" + entry.getValue().getNum());
			}
		}

	}

	/**
	 * ����������
	 */
	public void settleAccounts() {

		double totalPrice = 0;

		// �����ܼ�
		for (Entry<String, GoodsInCart> entry : entrySet) {
			totalPrice = totalPrice + entry.getValue().getGoods().getPrice() * entry.getValue().getNum();
		}

		System.out.println("��Ʒ���ܼ�Ϊ��" + totalPrice);

		if (entrySet.size() != 0) {
			displayAllInCart(); // ��ʾ���ﳵ�е���Ʒ
		}

		shoppingCart.clear(); // �Ƴ����м�ֵ��
	}

}
