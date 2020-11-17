package com.ishang.javatest;

public class Common extends Goods {

	public void showCommon() {
		System.out.println("这是一个普通用户");
	}

	public void showBuy() {
		System.out.println("货物：" + goods);
		System.out.println("价格：" + price);
		System.out.println("数量：" + num);
		System.out.println("总价：" + total);
	}

	@Override
	public void goods(String _goods, float _price, int _num) {
		goods = _goods;
		price = _price;
		num = _num;
		total = _price * _num;
	}

}
