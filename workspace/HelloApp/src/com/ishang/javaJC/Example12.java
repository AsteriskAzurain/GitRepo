package com.ishang.javaJC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example12 {
	public static void main(String[] args) {
		int coins, i, j, bets, rand, rewards, unit;
		char choiceID, luckyID;
		boolean flag = true;
		coins = 10;
		bets = 0;
		unit = 1;
		choiceID = 'N';
		luckyID = 'N';
		BufferedReader br, bw;
		intro();  // 有关本游戏的信息
		while(flag == true) {
			// line1，统计当前的金币数，以判断是否有足够的金币数进入游戏
			System.out.println("您当前的金币总计：$" + coins);
			if(coins <= 0){
				System.out.println("您的金币已经用完，游戏结束！");
				flag = false;
				return;  // 没有金币，退出游戏
			}
			System.out.println("欢迎进入幸运苹果机，新的一轮游戏马上开始！");
			System.out.println("猜中的物品和对应的奖励如下:");
			System.out.println("A. 苹果 —— 2 金币");
			System.out.println("B. 木瓜 —— 5 金币");
			System.out.println("C. 西瓜 —— 10 金币");
			System.out.println("D. 香蕉 —— 20 金币");
			System.out.println("E. 橙子 —— 50 金币");
			System.out.println("F. 葡萄 —— 100 金币");
			System.out.println("结束游戏，请按Q！");
			// line2，玩家输入选择的水果种类
			try {
				System.out.print("请输入您选中的水果(输入大写字母A~F)：");
				br = new BufferedReader(new InputStreamReader(System.in));
				choiceID = (char)br.read();
				if(choiceID == 'Q') {  // line3，判断用户是否选择退出游戏
					flag = false;
					return;  // 玩家选择退出游戏
				}
				// line4，玩家输入押注的金币数
				do {
					System.out.print("请输入您要押的金币数(最多");
					System.out.print(coins + "金币）：");
					bw = new BufferedReader(new InputStreamReader(System.in));
					bets = Integer.parseInt(bw.readLine());
					if(bets > coins) {  // line5，当押注大于携带的金币数
						System.out.println("您的金币不足！");
						flag = false;  // 押注失败
					} else {
						flag = true;  // 押注成功
					}
				} while(flag == false);  // line6，押注失败时重新押注
			} catch(IOException e) {
				e.printStackTrace();
			}  // line7
			System.out.println("幸运苹果机开始运转……Good luck！");
			for(i = 0; i < 8; i++) {  // line8，运转8次
				for(j = 0; j < 555555555; j++) {}  // line9，延迟
				rand = (int)(Math.random()*10);  // line10，获得随机数
				switch(rand) {  // line11，每圈指向的是哪种水果
					case 1: System.out.println("~~~ 苹  果 ~~~");
							luckyID = 'A';
							break;
					case 2: System.out.println("~~~ 木  瓜 ~~~");
							luckyID = 'B';
							break;
					case 3: System.out.println("~~~ 西  瓜 ~~~");
							luckyID = 'C';
							break;
					case 4: System.out.println("~~~ 香  蕉 ~~~");
							luckyID = 'D';
							break;
					case 5: System.out.println("~~~ 橙  子 ~~~");
							luckyID = 'E';
							break;
					case 6: System.out.println("~~~ 葡  萄 ~~~");
							luckyID = 'F';
							break;
					default: System.out.println("~~~ 水果盘 ~~~");
							luckyID = 'N';
				}
			}  // line12
			if(choiceID == luckyID) {  // line13，猜对了
				unit = unitJudge(luckyID);  // 判断单注的奖励金币数
				rewards = bets * unit;  // 计算实际押注后的奖励金币数
				coins += rewards;  // 支付金币
				System.out.print("恭喜您猜对了！幸运之神给您的奖励为 ");
				System.out.println(rewards + " 金币！");
			} else {  // 猜错了
				coins -= bets;  // 扣除押注的金币
				System.out.print("很遗憾，您没有猜对……您损失了 ");
				System.out.println(bets + " 金币！");
			}  // line14
			System.out.println("本轮游戏结束----------------------\n");
		}
	}
	
	public static void intro() {  // 游戏介绍信息
		System.out.println("**************************************");
		System.out.println("* 幸运苹果机的游戏规则如下：         *");
		System.out.println("* •选择水果种类，每次只能选一种;    *");
		System.out.println("* •对你所选择的水果押注;            *");
		System.out.println("* •不同水果奖励不同;                *");
		System.out.println("* •每个初始玩家赠送10金币;          *");
		System.out.println("* •运转后，若停止在您选择的水果上， *");
		System.out.println("*  则获得奖励；否则损失您押注的金币。*");
		System.out.println("**************************************");
	}
// 根据ID判断各种水果对应的奖励
	public static int unitJudge(char ID) {
		int unit;
		switch(ID) {
			case 'A': unit = 2;
					break;
			case 'B': unit = 5;
					break;
			case 'C': unit = 10;
					break;
			case 'D': unit = 20;
					break;
			case 'E': unit = 50;
					break;
			case 'F': unit = 100;
					break;
			default: unit = 1;
		}
		return unit;
	}
}
