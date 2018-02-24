package goods;

public class GoodsInCart {
	private Goods goods;	// 商品信息
	private int num;		// 商品数量
	
	// 无参构建方法
	public GoodsInCart() {
		
	}
	
	// 带参构造方法，实现对所有属性的赋值
	public GoodsInCart(Goods goods, int num) {
		this.setGoods(goods);
		this.setNum(num);
	}
	
	// getter、setter方法
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
