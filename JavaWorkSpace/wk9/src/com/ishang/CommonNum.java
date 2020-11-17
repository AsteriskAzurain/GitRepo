package com.ishang;

import java.util.Scanner;

public class CommonNum {
	public static void main(String[] args) {
		System.out.print("输入�?");
		Scanner s = new Scanner(System.in);
		float h = s.nextFloat();
		float n = s.nextFloat();
		float sum = h;
		h = h/2;
		for(int i=2; i<=n;i++) {
			sum += h*2;
			h = h/2;
		}
		String re = "经过次数�?"+String.valueOf(n)+"反弹高度�?"+String.valueOf(h)+"，经过距离："+String.valueOf(sum);
		System.out.println(re);
	}
}
