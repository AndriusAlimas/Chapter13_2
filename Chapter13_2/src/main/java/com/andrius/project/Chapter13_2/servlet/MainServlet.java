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
		
	}
}
