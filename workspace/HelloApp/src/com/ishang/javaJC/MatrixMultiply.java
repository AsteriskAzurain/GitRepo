package com.ishang;
 
public class MatrixMultiply {
	public static void main(String args[]) { 
		int a[][] = {{8,13},{4,7},{5,2}};
		int b[][] = {{3,4,11},{6,1,10}} ;
		int result[][] = new int[3][3];
		int i, j, k; 
		for(i = 0 ; i < a.length; i++) {
			for(j = 0; j < b[0].length; j++) {
				result[i][j] = 0 ;
				for(k = 0; k < b.length ; k++) {
					result[i][j] += a[i][k]*b[k][j];
				}
			}
		} 
		System.out.println("the result of a*b is:");
		for(i = 0 ; i<result.length ; i++) {
			for(j = 0; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();//����
		}
	}
}
