package com.ishang.javaJC;

public class Example1 {

	public static void demo1() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					continue;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}

	public static void demo2() {
		int m = 2;
		int p = 1;
		int t = 0;
		for (; p < 5; p++) {
			if (t++ > m) {
				m = p + t;
			}
		}
		System.out.println("t equals " + t);
	}

	public static void demo3() {
		int i, j;
		for (i = 0, j = 0; i + j < 20; ++i, j += i) {
			System.out.println(i + j);
		}
	}

	public static void demo4() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					break;
				}
				System.out.println("i=" + i + " j=" + j + " ");
			}
		}
	}

	public static void demo5() {
		int i = 1;
		int j = 1;
		out: for (i = 1; i < 3; i++) {
			inner: for (j = 1; j < 3; j++) {
				if (j == 2) {
					continue out;
				}
			}
		}
		System.out.println("打印输出 i=" + i + ",j=" + j);
	}

	public static void demo6() {
		int i = 1;
		int j = 2;
		outer: while (i < j) {
			++i;
			++j;
			if (j % 3 == 0)
				continue outer;
			if (i % 3 == 1)
				break outer;
			System.out.println(i + j);
		}
	}

	public static void demo7() {
		int i = 1;
		int j = 1;
		out: for (i = 1; i < 3; i++) {
			inner: for (j = 1; j < 3; j++) {
				if (j == 2) {
					continue out;
				}
			}
		}
		System.out.println("打印输出 i=" + i + ",j=" + j);

	}

	public static void demo8() {
		int i = 0, j = 2;
		do {
			i = ++i;
			j--;
		} while (j > 0);
		System.out.println(i);
	}

	public static void demo9() {
		int val = 1;
		switch (val) {
		case 1:
			System.out.println("P");
		case 2:
		case 3:
			System.out.println("Q");
			break;
		case 4:
			System.out.println("R");
		default:
			System.out.println("S");
		}
	}

	public static void demo10() {
		outer: for (int i = 0; i < 3; i++) {
			inner: for (int j = 0; j < 3; j++) {
				if (j > 1) {
					break inner;
				}
				System.out.println(j + "and" + i);
			}
		}
	}

	public static void demo11() {
		outer: for (int i = 0; i < 3; i++) {
			inner: for (int j = 0; j < 2; j++) {
				if (j == 1) {
					continue outer;
				}
				System.out.println(j + "and" + i);
			}
		}
	}

	public static void demo12() {
		int i = 100;
		switch (i) {
		case 100:
			System.out.println(i);
		case 200:
			System.out.println(i);
		case 300:
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Example1.demo10();
		 
	}

	public static void test1() {
		int i = 7; 
		switch (i) { 
		case 6:
		case 7:
		case 8:
			System.out.println("夏"); 
		case 9:
		case 10:
		case 11:
			System.out.println("秋"); 
		case 12:
		case 1:
		case 2:
			System.out.println("冬"); 
		}
	}
}
