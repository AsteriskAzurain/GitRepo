package com.ishang.javaJC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Example9 {
	public static void main(String[] args) throws IOException {
		System.out.println("本程序提供历届奥运会查询（1~28届）。");
		System.out.print("请输入需要查询的届数: ");
		int times, year; // 届数和举办的年份
		String place; // 举办的城市
		// line1，取得用户的输入
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		// line2，读取行并将类型转换为整型
		times = Integer.parseInt(dataIn.readLine());
		switch (times) { // line3，开关
		case 1:
			year = 1896;
			place = "雅典";
			break;
		case 2:
			year = 1900;
			place = "巴黎";
			break;
		case 3:
			year = 1904;
			place = "圣路易斯";
			break;
		case 4:
			year = 1908;
			place = "伦敦";
			break;
		case 5:
			year = 1912;
			place = "斯德哥尔摩";
			break;
		case 7:
			year = 1920;
			place = "安特卫普";
			break;
		case 8:
			year = 1924;
			place = "巴黎";
			break;
		case 9:
			year = 1928;
			place = "阿姆斯特丹";
			break;
		case 10:
			year = 1932;
			place = "洛杉矶";
			break;
		case 11:
			year = 1936;
			place = "柏林";
			break;
		case 14:
			year = 1948;
			place = "伦敦";
			break;
		case 15:
			year = 1952;
			place = "赫尔辛基";
			break;
		case 16:
			year = 1956;
			place = "墨尔本";
			break;
		case 17:
			year = 1960;
			place = "罗马";
			break;
		case 18:
			year = 1964;
			place = "东京";
			break;
		case 19:
			year = 1968;
			place = "墨西哥";
			break;
		case 20:
			year = 1972;
			place = "慕尼黑";
			break;
		case 21:
			year = 1976;
			place = "蒙特利尔";
			break;
		case 22:
			year = 1980;
			place = "莫斯科";
			break;
		case 23:
			year = 1984;
			place = "洛杉矶";
			break;
		case 24:
			year = 1988;
			place = "汉城";
			break;
		case 25:
			year = 1992;
			place = "巴塞罗那";
			break;
		case 26:
			year = 1996;
			place = "亚特兰大";
			break;
		case 27:
			year = 2000;
			place = "悉尼";
			break;
		case 28:
			year = 2004;
			place = "雅典";
			break;
		default:
			year = 0;
			place = "Unknown";
		}
		if (year != 0) {
			System.out.print("查询结果：第 " + times + " 届奥运会于");
			System.out.println(year + " 年在 " + place + " 举行。");
		} else {
			System.out.println("错误！请检查输入的届数！");
		}
	}
}
