package com.ishang.javaJC;

public class Example5 {
	public static void main(String[] args) {
		outer: for (int x = 0; x < 3; x++) {
			System.out.println("outer");
			middle: for (int y = 0; y < 3; y++) {
				System.out.println("middle");
				inner: for (int z = 0; z < 3; z++) {
					System.out.println("inner");
					break;
				}
			}
		}
	}
}
