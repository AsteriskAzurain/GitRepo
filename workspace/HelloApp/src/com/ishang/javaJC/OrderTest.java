package com.ishang.javaJC;

import java.util.Arrays;

public class OrderTest { 
	public static void Order1Array(int arr[]) {
		int temp   ;  
		int result[] ;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
				
			}
		}  
		for(int n = 0 ; n< arr.length;n++) {
			System.out.print(arr[n] + " ");
		} 
		System.out.println();
	}
	 
	public static void Order2Array(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int tem=i; 
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[tem]) {
					tem = j;
				}
			} 
			int temp1=arr[i];
			arr[i]=arr[tem];
			arr[tem]=temp1;
		}
		 
		for(int n = 0 ; n< arr.length;n++) {
			System.out.print(arr[n] + " ");
		} 
		System.out.println();
	}
	
	 
	public static void Order3Array(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			} 
		} 
		for(int n = 0 ; n< arr.length;n++) {
			System.out.print(arr[n] + " ");
		} 
		System.out.println();
	}
	 
	public static void Order4Array(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int tp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=tp;
		}
		//��ӡ
		for(int n = 0 ; n< arr.length;n++) {
			System.out.print(arr[n] + " ");
		} 
		System.out.println();
	}	
	
	
	public  static void main(String[] args) {
		int arr[]= {37,28,51,13,64};
		System.out.println("------1.ϵͳ�Դ�����---------");
		Arrays.sort(arr);
		for(int n = 0 ; n< arr.length;n++) {
			System.out.print(arr[n] + " ");
		}  
		System.out.println(); 
		System.out.println("------2.ð������---------");
		OrderTest.Order1Array(arr);	
		System.out.println("------3.ѡ������---------");
		OrderTest.Order2Array(arr);
		System.out.println("------4.��������---------");
		OrderTest.Order3Array(arr);
		System.out.println("------5.��ת����---------");
		OrderTest.Order4Array(arr);
	}

}
