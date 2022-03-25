package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NewSer implements Servlet {

	@Override
	public void destroy() {
		System.out.println("going to destroy servlet object");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "created by saloni";
	}

	
	ServletConfig config;
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	        System.out.println("I am started");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	System.out.println("servicing");
		
	}

}
