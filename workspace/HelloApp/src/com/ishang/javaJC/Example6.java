package com.ishang.javaJC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example6  {
	public static void main(String[] args)  throws IOException {
		 int dataIn;
		// line1，获取命令行输入的年份
		 System.out.print("请输入需要查询的 年份: ");
		BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in)); 
		// line2，读取行并将类型转换为整型
		dataIn = Integer.parseInt(brIn.readLine());
		if (dataIn <=0) {
			System.out.println("没有输入需要判断的年份。");
			return;
		}  
		// line2，调用方法判断是否为闰年
		if (isLoopYear(dataIn)) {
			System.out.println(dataIn + " 是闰年。");
		} else {
			System.out.println(dataIn + " 不是闰年。");
		}
	}

	public static boolean isLoopYear(int year) {
		// line3，闰年的判断规则
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}
}
