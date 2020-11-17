package com.ishang.ch_09;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineListener implements HttpSessionListener {
	private static int onlineCount=0;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		 onlineCount++; 
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println();
		 if(onlineCount>0)  
			 onlineCount--;
	}
	
	public static int getOnlineCount(){
    	return onlineCount;
}

}
