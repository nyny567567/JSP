package com.myweb.board.commons;

<<<<<<< HEAD
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/*")
public class TestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("필터 동작!");
		
		chain.doFilter(request, response);
		
	}

}











=======


public class TestFilter implements Filter {

//@WebFilter("/*")
public class testFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest)
}
>>>>>>> 53e6a99af68d1867ed83f5e3c0733cb3e79dbc18
