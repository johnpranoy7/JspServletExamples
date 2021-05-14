package com.TeluskoServletJsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	/*	You can Either Override a Service method or doGet,doPost Method. 
     	The reason for writing in doPost instead of service is because on clients end 
		we can change the method from Inspect in browser and get our required method. 
		so we can limit that using doGet. doPost	*/
	
//	
//	  public void service(HttpServletRequest request, HttpServletResponse response)
//	  throws IOException { int i = Integer.parseInt(request.getParameter("Inp1"));
//	  int j = Integer.parseInt(request.getParameter("Inp2"));
//	  System.out.println(i+j); PrintWriter out = response.getWriter();
//	  out.println("i"+i+"j"+j); }
//	 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("Inp1"));
		int j = Integer.parseInt(request.getParameter("Inp2"));
		int k = i + j;
		
		//Sending Data to next Servlet
		request.setAttribute("k", k);
		
		/*Can redirect from one servlet to other using 2 ways. 
		 * Request Dispatcher and SendRedirect
		 * Here wer using Request dispatcher*/
		RequestDispatcher rd = request.getRequestDispatcher("sqr");
		rd.forward(request, response);	
		
	
//		PrintWriter out = response.getWriter();
//		out.println("i"+i+"j"+j);
	}
}
