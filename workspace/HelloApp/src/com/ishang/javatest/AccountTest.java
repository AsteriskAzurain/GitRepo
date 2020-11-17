package com.ishang.javatest;

public class AccountTest {

	public static void main(String[] args) {
		BankAccount anAccount;
		anAccount = new BankAccount("Zhangqiang", 10023, 0);
		anAccount.setBalance(anAccount.getBalance() + 100);
		System.out.println("Here is the account：" + anAccount.toString());
		System.out.println("Account name：" + anAccount.getOwnerName());
		System.out.println("Account number：" + anAccount.getAccountNum());
		System.out.println("Balance：$" + anAccount.getBalance());
		anAccount = new BankAccount("Wanghong", 10024, 0);
		System.out.println(anAccount.toString());
		anAccount.deposit(225.67f);
		anAccount.deposit(300.00f);
		System.out.println(anAccount.toString());
		anAccount.withdraw(400.17f);
		System.out.println(anAccount.toString());

	}

	 
}
