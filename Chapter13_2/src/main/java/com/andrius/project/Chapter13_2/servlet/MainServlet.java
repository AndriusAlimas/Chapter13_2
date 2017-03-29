package com.andrius.project.Chapter13_2.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MainServlet extends HttpServlet {
	
	public void init(ServletConfig config){
		System.out.println("-----------------------------------------");
		System.out.println("init() method is called in " + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res)throws ServletException, IOException{
		
		System.out.println("doGet() method called in " + 
				this.getClass().getName() + "\n\n");
		System.out.println("-----------------------------------------");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>SUCCESS</h1><br>");
	}
	
	public void destroy(){
		System.out.println("-----------------------------------------");
		System.out.println("destroy() method is called in " + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}
}
