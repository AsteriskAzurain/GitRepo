package com.ishang.javatest;

//银行账号类定义
public class BankAccount {
	private String ownerName;
	private int accountNum;
	private float Balance;

	// 无参构造方法
	public BankAccount() {
		this("  ", 0, 0);
	}

	// 有参构造方法
	public BankAccount(String _Name, int _Num, float _Balance) {
		ownerName = _Name;
		accountNum = _Num;
		Balance = _Balance;
	}

	// 设置姓名方法
	public void setOwnerName(String newName) {
		ownerName = newName;
	}

	// 获取姓名方法
	public String getOwnerName() {
		return ownerName;
	}

	// 设置账号方法
	public void setAccountNum(int newNum) {
		accountNum = newNum;
	}

	// 获取账号方法
	public int getAccountNum() {
		return accountNum;
	}

	// 设置存款方法
	public void setBalance(float newBalance) {
		Balance = newBalance;
	}

	// 获取存款方法
	public float getBalance() {
		return Balance;
	}

	// 字符串转换输出
	public String toString() {
		return ("Account #" + accountNum + "with balance $" + Balance);
	}

	// 存款方法
	public float deposit(float anAccount) {
		Balance = Balance + anAccount;
		return (Balance);
	}

	// 取款方法
	public float withdraw(float anAccount) {
		Balance = Balance - anAccount;
		return (Balance);
	}

}
