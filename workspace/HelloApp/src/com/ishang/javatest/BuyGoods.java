package com.ishang.javatest;

public class BuyGoods {

	public static void main(String[] args) {
		Common AA = new Common(); // 声明一级子类对象并初始化
		AA.showCommon(); // 调用一级子类内部成员方法
		AA.goods("电视机", 3800, 2); // 实例化对象
		AA.showBuy(); // 调用一级子类内部成员方法
		Associator BB = new Associator(); // 声明二级子类对象并初始化
		BB.goods("洗衣机", 1980, 3); // 实例化对象
		BB.showAssociator(); // 调用二级子类内部成员方法
		BB.showBuy(); // 调用一级子类(父类)成员方法
	}

}
