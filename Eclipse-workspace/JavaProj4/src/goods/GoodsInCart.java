package goods;

public class GoodsInCart {
	private Goods goods;	// ��Ʒ��Ϣ
	private int num;		// ��Ʒ����
	
	// �޲ι�������
	public GoodsInCart() {
		
	}
	
	// ���ι��췽����ʵ�ֶ��������Եĸ�ֵ
	public GoodsInCart(Goods goods, int num) {
		this.setGoods(goods);
		this.setNum(num);
	}
	
	// getter��setter����
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
