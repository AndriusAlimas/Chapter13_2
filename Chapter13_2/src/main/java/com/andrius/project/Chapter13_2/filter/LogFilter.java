package com.andrius.project.Chapter13_2.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class LogFilter implements Filter{
	private FilterConfig config;
	
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		
		System.out.println("-----------------------------------------");
		System.out.println("init() method is called in " + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() method called in " + 
			this.getClass().getName() + "\n\n");
		
		// cast to HttpServletRequest because we want use method from http request:
		HttpServletRequest http_req = (HttpServletRequest)req;
		
		// get remote address of client machine:
		String ipAddress = http_req.getRemoteAddr();
		
		// Log ip address and current timestamp:
		System.out.println("IP: " + ipAddress + " , Time: " +
		new Date().toString() + "\n\n");
		
		// if no more filter will send these object to servlet:
		chain.doFilter(req, res);
	}

	public void destroy() {
		// cleanup code
		System.out.println("-----------------------------------------");
		System.out.println("destroy() method called in " + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}


}
