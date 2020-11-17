package com.ishang.javatest;

public final class Associator extends Common {
	public void showAssociator() {
		System.out.println("这是一个会员用户");
	}

	public void showBuy() {
		super.showBuy();
		System.out.println("作为会员用户，享受9折优惠");
		System.out.println("总价：" + total * 0.9);
	}

}
