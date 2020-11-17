package com.ishang.javaJC;

public class Example11 {
	public static void main(String[] args) {
		// 求beginNum与endNum之间的素数的和，存入sum
		int i, j, k = 0, sum = 0;
		int beginNum = 100, endNum = 500;
		System.out.println(beginNum + " ~ " + endNum + "的素数如下：");
		NEXT:
		for(i = beginNum; ; i++) {
			if(i == endNum) break;  // line1，跳出循环
			for(j = 2; j <= Math.sqrt(i); j ++) {  // line2
				if(i % j == 0) {
					continue NEXT;  // line3，跳转到标号为NEXT的行
				}
			}
			sum += i;  // 累加素数
			k ++;
			System.out.print(i + " ");
			if(k % 10 == 0) System.out.print('\n');
		}
		System.out.println("\n它们的和为：" + sum);
	}
}
