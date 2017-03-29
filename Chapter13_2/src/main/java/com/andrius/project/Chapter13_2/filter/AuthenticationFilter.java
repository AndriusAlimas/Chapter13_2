package com.andrius.project.Chapter13_2.filter;
import javax.servlet.*;
import java.io.*;

public class AuthenticationFilter implements Filter {
	private FilterConfig config;
	
	
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain)throws ServletException,IOException{
		
	}
	
	public void init(FilterConfig config){
		this.config = config;
	}
	public void destroy(){
		
	}
}
