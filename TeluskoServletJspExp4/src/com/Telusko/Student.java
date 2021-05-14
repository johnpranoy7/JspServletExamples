package com.Telusko;

public class Student { // If your class isnt public the ELtag wont be able to see object parameters
	private int sno;
	private String sname;

	public Student() {

	}

	public Student(int sno, String sname) {
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
