package com.ishang.ch_09;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterIP implements Filter {

	String FilteredIP;

	@Override
	public void destroy() { 

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String remoteIP = request.getRemoteAddr();
		if (remoteIP.equals(FilteredIP)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("ErrorInfo.jsp");
			// 读出本地IP，将其与要过滤掉的IP比较，如果相同，就转移到错误处理页面
			dispatcher.forward(request, response);
		} else {
			chain.doFilter(request, response); 
			// 将请求转发给过滤链上的其他对象
		}

	}

	@Override
	public void init(FilterConfig conf) throws ServletException {
		FilteredIP = conf.getInitParameter("FilteredIP");
		if (FilteredIP == null)
			FilteredIP = "";

	}

}
