package com.ishang.javaJC;

public class Example20 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0, j = 10; total < 30; ++i, --j) {
			System.out.println("i=" + i + ": j=" + j);
			total += (i + j);
		}
		System.out.println("Total "+ total);
	}
}
