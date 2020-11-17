package com.ishang;

public class Example {

	public static void main(String[] args) {
		String a = Example.test1(2, 5);
		System.out.println(a);

	}

	//2+22+222=246
	public static String test1(int a, int b) {
		int sum = 0;
		String rs = "";
		int total = 0;
		for (int i = 1; i <= b; i++) {
			sum += a;
			rs += String.valueOf(sum) + "+";
			total = total + sum;
			a = a * 10;
		}
		return rs.substring(0, rs.length() - 1) + "=" + total;
	}

	/**
	 * 输入：100米,3次， 经过次数：3.0反弹高度：12.5，经过距离：250.0
	 */
	public static String test2(double h, double n) {
		double sum = h;
		h = h / 2;
		for (int i = 2; i <= n; i++) {
			sum += 2 * h;
			h = h / 2;
			System.out.println("反弹高度：" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum));
		}
		return "经过次数：" + String.valueOf(n) + "反弹高度：" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum);
	}
	
	public static String test22(double h, double n) {
		double sum = h; 
		for (int i = 0; i < n; i++) { 
			h = h / 2;
			sum += 2 * h; 
			System.out.println("反弹高度：" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum));
		}
		return "经过次数：" + String.valueOf(n) + "反弹高度：" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum);
	}
	
	

}
