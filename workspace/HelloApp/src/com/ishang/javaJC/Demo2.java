package com.ishang.javaJC;

public class Demo2 {

	public static void main(String[] args) {
		String a = "1";
		int b = Integer.valueOf(a);
        for(int i=1;i<10;i++) {
        	String k ="" ;
            for(int j=1;j<=i;j++) {
            	k += j;
            }
            System.out.println(k+"  ");
        }
        
        if (Math.random()<0.5) {
        	System.out.println("Hava a nice day");
        }else {
        	System.out.println("Hava a lousy day");
        }
	}

}
