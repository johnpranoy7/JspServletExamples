package com.Telusko;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class ELservlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Prudent[] s = { new Prudent(2, "John"), new Prudent(1, "Abc") };
//		Student t = new Student();
		HttpSession session = request.getSession();
		session.setAttribute("s", s);
		// request.setAttribute("s", s);
		RequestDispatcher rd = request.getRequestDispatcher("ELjsp.jsp");
		rd.forward(request, response);
		// response.sendRedirect("ELjsp.jsp");
	}

}

class Prudent { // If your class isnt public the ELtag wont be able to see object parameters
	private int sno;
	private String sname;

	public Prudent() {

	}

	public Prudent(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	public int getSno() {
		return this.sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
