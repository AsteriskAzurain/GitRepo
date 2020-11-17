package com.ishang.javaJC;

//用while循环实现
public class Example10 {
	public static void main(String[] args) {
		int n = 100;
		int sum = 0 ,i = 1; 
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
