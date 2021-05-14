package com.Telusko;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie1")
public class Cookie1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i =Integer.parseInt(request.getParameter("inp1"));
		
		Cookie cookie = new Cookie("i",i+"");	
		response.addCookie(cookie);					
		
		response.sendRedirect("cookie2");  //redirecting to cookie2 servlet
	}

}
