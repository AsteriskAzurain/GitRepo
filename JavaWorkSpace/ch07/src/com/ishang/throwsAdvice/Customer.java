package com.ishang.throwsAdvice;

public class Customer {
	private String name; //客户姓名
	//客户购买东西
    public void buy(){
    	int[] arr = new int[10];    //实例化一个数组
    	arr[10] = 1;                //数组越界
      	System.out.println("客户" +this.name+"买东西");
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
