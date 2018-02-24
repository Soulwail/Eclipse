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
	private Map<String, GoodsInCart> shoppingCart = new HashMap<String, GoodsInCart>(); // 属性：购物车

	// 无参构造方法
	public ShoppingCart() {

	}

	// 带参构造方法
	public ShoppingCart(Map shoppingCart) {
		this.setShoppingCart(shoppingCart);
	}

	// getter、setter方法
	public Map getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Map shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	Scanner sc = new Scanner(System.in);

	// 方法：添加商品到购物车
	public void addGoodsToCart(GoodsManage gm) {

		GoodsInCart goodsInCart = new GoodsInCart();
		Iterator it = gm.getGoodsSet().iterator();
		boolean flag = false;
		Goods goods = null;

		System.out.println("请输入要添加的商品编号：");
		String goodsId = sc.next();
		// 判断商品是否存在
		while (it.hasNext()) {
			goods = (Goods) it.next();
			if (goods.getGoodsId().equals(goodsId)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("请输入要添加的商品数量：");
			int num = sc.nextInt();
			goodsInCart.setGoods(goods);
			goodsInCart.setNum(num);

			String key = goodsId;
			GoodsInCart value = goodsInCart;

			shoppingCart.put(key, value);
		} else {
			System.out.println("请输入正确的商品编号！");
		}

	}

	// 通过entrySet方法，返回Map中的所有键值对
	Set<Entry<String, GoodsInCart>> entrySet = shoppingCart.entrySet();

	// 方法：修改购物车中的商品数量
	public void updateNumInCart() {
		if (entrySet.size() == 0) {
			System.out.println("购物车中没有商品，请购买商品再来！");
		} else {

			System.out.println("修改购物车中的商品数量");
			System.out.println("请输入要修改的商品编号：");
			String goodsId = sc.next();
			Set<String> keySet = shoppingCart.keySet();

			boolean flag = false;
			for (String key : keySet) {

				if (goodsId.equals(key)) {

					System.out.println("请输入新的商品数量：");
					int newNum = sc.nextInt();

					if (newNum == 0) {
						System.out.println("因为商品数量为0，该商品已经从购物车移除！");
						shoppingCart.remove(key);
						break;
					} else {
						shoppingCart.get(key).setNum(newNum);
					}

					flag = true;
				}
			}

			if (!flag) {
				System.out.println("请输入正确的商品编号!");
			}
		}
	}

	// 方法：显示购物车中的所有商品
	public void displayAllInCart() {

		if (entrySet.size() == 0) {
			System.out.println("购物车是空的哟，赶快装满吧~");
		} else {
			for (Entry<String, GoodsInCart> entry : entrySet) {
				System.out.println("商品名称：" + entry.getValue().getGoods().getGoodsName() + "，商品价格："
						+ entry.getValue().getGoods().getPrice() + "，商品描述：" + entry.getValue().getGoods().getGoodsDesp()
						+ "，数量：" + entry.getValue().getNum());
			}
		}

	}

	/**
	 * 方法：结算
	 */
	public void settleAccounts() {

		double totalPrice = 0;

		// 计算总价
		for (Entry<String, GoodsInCart> entry : entrySet) {
			totalPrice = totalPrice + entry.getValue().getGoods().getPrice() * entry.getValue().getNum();
		}

		System.out.println("商品的总价为：" + totalPrice);

		if (entrySet.size() != 0) {
			displayAllInCart(); // 显示购物车中的商品
		}

		shoppingCart.clear(); // 移除所有键值对
	}

}
