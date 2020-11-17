package com.ishang;

public class ArratTest {
	public static void main(String args[]) {
		int i,length,temp;
		int a[] = {3,15,28,11,34,78,95,27,18};
		length = a.length;
		for(i = 0 ; i<(length/2) ; i++) {		
			temp = a[i] ;
			a[i] = a[length-1-i];
			a[length-1-i] = temp; 
		}
		for(i = 0 ; i<length; i++) 
			System.out.print(a[i]+" ");
		System.out.print("\n");
	}
}
