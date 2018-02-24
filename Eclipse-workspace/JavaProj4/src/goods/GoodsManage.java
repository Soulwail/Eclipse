package goods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
	private Set<Goods> goodsSet = new HashSet<Goods>(); // ���ԣ������Ʒ������

	// �޲ι��췽��
	public GoodsManage() {

	}

	// ���ι��췽��
	public GoodsManage(Set goodsSet) {
		this.setGoodsSet(goodsSet);
	}

	// getter��setter����
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}

	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}

	/**
	 * ��Ʒ��Ϣ���뷽��
	 */
	public void importGoods() {

		Goods goods1 = new Goods("goods001", "ˮ��", 56, "�����ˮ��");
		Goods goods2 = new Goods("goods002", "��ˮ��", 299, "���������ܵ���ˮ��");
		Goods goods3 = new Goods("goods003", "�ʼǱ�����", 4999, "15��ʼǱ�����");
		Goods goods4 = new Goods("goods004", "�ֻ�", 2300, "android�ֻ�");

		goodsSet.add(goods1);
		goodsSet.add(goods2);
		goodsSet.add(goods3);
		goodsSet.add(goods4);
		System.out.println("����ɹ���");
	}

	/**
	 * ��ʾ������Ʒ��Ϣ
	 */
	public void displayAllGoods() {
		System.out.println("������Ʒ��ϢΪ��");
		Iterator it = this.getGoodsSet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
