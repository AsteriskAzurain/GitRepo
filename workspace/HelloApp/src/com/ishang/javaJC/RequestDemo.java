package com.ishang;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RequestDemo  {
	
	public static void main(String[] args) {
 
		try {
			InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostName());//������
            System.out.println(address.getCanonicalHostName());//��������
            System.out.println(address.getHostAddress());//��ȡIP��ַ
            System.out.println("===============");
            
          //���������� InetAddress����
            InetAddress address1 = InetAddress.getByName("www.baidu.com");
            //��ȡ���Ǹ���վ��ip��ַ������������е�����ͨ��nginx�ģ����������ȡ������ʵ��nginx��������IP��ַ
            System.out.println(address1.getHostName());//www.wodexiangce.cn
            System.out.println(address1.getCanonicalHostName());//124.237.121.122
            System.out.println(address1.getHostAddress());//124.237.121.122
            System.out.println("===============");
            
            //��IP��ַ����InetAddress����
            InetAddress address2 = InetAddress.getByName("220.181.111.188");
            System.out.println(address2.getHostName());//220.181.111.188
            System.out.println(address2.getCanonicalHostName());//220.181.111.188
            System.out.println(address2.getHostAddress());//220.181.111.188
            System.out.println("===============");
            
            //������������������ܵ�����InetAddress����
            InetAddress[] addresses = InetAddress.getAllByName("www.jd.com");
            for (InetAddress addr : addresses) {
                System.out.println(addr);
                //www.baidu.com/220.181.111.188
                //www.baidu.com/220.181.112.244
            }
            
            
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

	
}
