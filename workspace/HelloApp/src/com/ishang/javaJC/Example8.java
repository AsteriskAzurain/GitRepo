package com.ishang.javaJC;

public class Example8 {
	public static void main(String[] args) {
		int i, j, result;
		String space;
		for (i = 1; i < 10; i++) { // line1，外循环开始
			for (j = 1; j < 10; j++) { // linie2，内循环开始
				result = i * j;
				if (result >= 10 || j == 1) { // line3，美化输出效果
					space = " ";
				} else { // line4
					space = "  ";
				} // line5
				System.out.print(i + "*" + j + "=" + result + space);
			} // line6，内循环结束
			System.out.print('\n'); // 每行显示十组结果
		} // line7，外循环结束
	}
}
