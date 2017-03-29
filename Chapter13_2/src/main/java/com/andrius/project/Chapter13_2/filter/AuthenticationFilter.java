package com.andrius.project.Chapter13_2.filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class AuthenticationFilter implements Filter {
	private FilterConfig config;
	
	public void init(FilterConfig config){
		this.config = config;
		
		System.out.println("-----------------------------------------");
		System.out.println("init() method is called in " + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}
	
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain)throws ServletException,IOException{
		
		System.out.println("doFilter() method called in " + 
				this.getClass().getName() + "\n\n");
		
		// cast to HttpServletRequest because we want use method from http request:
				HttpServletRequest http_req = (HttpServletRequest)req;
		// cast to HttpServletResponse because we want use method from http response:
				HttpServletResponse http_res = (HttpServletResponse)res;
				
		// get request parameters username and password:
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(!(username.equalsIgnoreCase("andrius") && password.equalsIgnoreCase("andrius"))){
			System.out.println("###################################################");
			System.out.println("Unauthorized request!");
			System.out.println("###################################################\n\n");
			http_res.sendRedirect("index.jsp");
		}
		else{
			// if user name and password correct pass this request along the filter chain:
			chain.doFilter(req, res);
		}
	}
	
	public void destroy(){
		// cleanup code
				System.out.println("-----------------------------------------");
				System.out.println("destroy() method called in " + this.getClass().getName());
				System.out.println("-----------------------------------------");
	}
}
