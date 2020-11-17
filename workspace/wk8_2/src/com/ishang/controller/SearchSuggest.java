package com.ishang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchSuggest extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "<words><word>a</word><word>ab</word><word>abc</word><word>abcd</word><word>abcde</word></words>");
		map.put("ab", "<words><word>ab</word><word>abc</word><word>abcd</word><word>abcde</word></words>");
		map.put("abc", "<words><word>abc</word><word>abcd</word><word>abcde</word></words>");
		map.put("abcd", "<words><word>abcd</word><word>abcde</word></words>");
		map.put("abcde", "<words><word>abcde</word></words>");
		String inputWord = request.getParameter("inputWord");
		if (!map.containsKey(inputWord)) {
			out.println("<words></words>");
		} else {
			out.println(map.get(inputWord).toString());
		}
	}
}
