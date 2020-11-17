package com.ishang;

public class Yanghui {

	//����һ����ά�����ӡ�������
	public static void yanghui1(int num) {
		//�����ά���������������ֵ
		int[][] yangHui = new int [num][];
		for(int i = 0; i < yangHui.length; i ++) {
			yangHui[i] = new int[i + 1];
		}
		
		//����������ǵļ��㹫ʽ����ʼ������
		for(int i = 0; i < yangHui.length; i ++) {
			for(int j = 0; j < yangHui[i].length; j ++) {
				//ÿһ�е�һ���������һ������Ϊ1
				yangHui[i][0] = yangHui[i][i] = 1; 
				if(i > 1 && j > 0 && j < i) {
					//������ǵ�ֵ��������һ������ֵ֮��
					yangHui[i][j] = yangHui[i - 1][j] + yangHui[i -1][j -1];
				}
			}
		}
		
		//�������飬�����
		for(int i = 0; i < yangHui.length; i ++) {
			for(int j = 0; j < yangHui[i].length; j ++) {
				System.out.print(yangHui[i][j] + "\t"); 
			} 
			System.out.println();
		} 
		
	}
	
	
	//��������һά�����ӡ�������
	public static void yanghui2(int num) {
		//����UP�������Դ洢��һ�������
		int[] up = new int[num];
		for(int i = 0; i <= num; i ++) {
			//����a�������Դ�ű����������
			int[] a = new int[i];
			for(int j = 0; j < i; j ++) {
				//�������һ�������һ����ֵ��ֵΪ1
				if(j == 0 || j == i) {
					a[j] = up[j] = 1;
				}
				//���ӵ������𣬷���β���ֵ�ֵ�����Ϸ�����ֻ��
				if(i > 2 && j !=0 && j != i ) {
					a[j] = up[j - 1] + up[j];
				}
			}
			 
			//��������������浽up�����У��Թ�һ�´�����ʹ��
			for(int k = 0; k < i; k ++) {
				up[k] = a[k];
			}
			
			//��ӡ��������
			for(int k = 0; k < (num - i - 1) / 2; k ++) {
				System.out.print("\t");
			}
			for(int k = 0; k < i; k ++) {
				 System.out.print(a[k] + "\t");
			}
			 System.out.println();
		} 
	}
	
	//����һ��һά�����ӡ�������
	public static void yanghui3(int num) {		
		//����������������ǵ���ֵ
		int yangHui[] = new int[(1 + num) * num / 2];
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < (num - i - 1) / 2; j ++) {
				System.out.print("\t");
			}
			
			//temp��ʾ�Ѿ��洢�����ָ���
			int temp = (1 + i) * i / 2;
			for(int j = 0; j <= i; j ++) {
				//ÿһ�����β��ֵΪ1
				if(j == 0 || j == i) {
					yangHui[temp + j] = 1;
				}else {
					 //����β��ֵΪ��������֮��
					yangHui[temp + j] = yangHui[temp + j - i] + yangHui[temp + j - i - 1];					
				}
				System.out.print(yangHui[temp + j] + "\t");
			}
			System.out.println();
		}    
	}
	
	
	public static void main(String[] args) {
		int rows = 10 ;
		for(int i =0;i<rows;i++) {
            int number = 1;
            //��ӡ�ո��ַ���
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                 System.out.format("%4d",number);
                 number = number * (i - j) / (j + 1);                
            }
            System.out.println();
        }
	}
	
}
