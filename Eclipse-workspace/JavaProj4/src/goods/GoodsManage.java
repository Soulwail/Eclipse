package goods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
	private Set<Goods> goodsSet = new HashSet<Goods>(); // 属性：存放商品的容器

	// 无参构造方法
	public GoodsManage() {

	}

	// 带参构造方法
	public GoodsManage(Set goodsSet) {
		this.setGoodsSet(goodsSet);
	}

	// getter、setter方法
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}

	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}

	/**
	 * 商品信息导入方法
	 */
	public void importGoods() {

		Goods goods1 = new Goods("goods001", "水杯", 56, "不锈钢水杯");
		Goods goods2 = new Goods("goods002", "饮水机", 299, "带净化功能的饮水机");
		Goods goods3 = new Goods("goods003", "笔记本电脑", 4999, "15寸笔记本电脑");
		Goods goods4 = new Goods("goods004", "手机", 2300, "android手机");

		goodsSet.add(goods1);
		goodsSet.add(goods2);
		goodsSet.add(goods3);
		goodsSet.add(goods4);
		System.out.println("导入成功！");
	}

	/**
	 * 显示所有商品信息
	 */
	public void displayAllGoods() {
		System.out.println("所有商品信息为：");
		Iterator it = this.getGoodsSet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
