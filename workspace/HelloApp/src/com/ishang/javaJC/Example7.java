package com.ishang.javaJC;

public class Example7 {
	public static void main(String[] args) {
		int num1, num2, maxDiv, minMul;
		num1 = 42;
		num2 = 12;
		System.out.print(num1 + " 和 " + num2 + " 的最大公约数为：");
		maxDiv = maxCommonDiv(num1, num2); // 最大公约数
		System.out.println(maxDiv);
		System.out.print(num1 + " 和 " + num2 + " 的最小公倍数为：");
		minMul = minCommonMul(num1, num2); // 最小公倍数
		System.out.println(minMul);
	}

	public static int maxCommonDiv(int a, int b) {
		int r;
		while (b != 0) { // line1，辗转相除得最大公约数
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int minCommonMul(int a, int b) {
		int max, min, i;
		max = a > b ? a : b; // line2，取得两数中较大的数
		min = a < b ? a : b; // line3，取得两数中较小的数
		for (i = 1; i < min; i++) { // line4，for循环体
			if (max * i % a == 0 && max * i % b == 0) {
				return max * i;
			}
		}
		return a * b; // 若没找到要求的数，则返回两数的乘积为最小公倍数
	}
}
