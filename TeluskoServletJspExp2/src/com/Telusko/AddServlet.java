package com.Telusko;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	int k = Integer.parseInt(request.getParameter("inp1"));
	
	response.sendRedirect("sqr?k="+k);
}
}
