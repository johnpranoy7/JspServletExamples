package com.TeluskoServletJsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//Getting the k value from previous servlet 
		int k = (int) request.getAttribute("k");
		PrintWriter out = response.getWriter();
		out.print("SquareServlet says"+k*k);
	}
}
