package com.Telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "cookie2", urlPatterns = { "/cookie2" })
public class Cookie2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numText="";
		
		Cookie[] cookies = request.getCookies();	
		
		for(Cookie c : cookies) {
			if(c.getName().equals("i"))
				numText = c.getValue();
		}
		
		PrintWriter out = response.getWriter();
		out.print("Value from cookie is:"+numText);
	}

}
