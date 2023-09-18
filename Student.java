package com.estudent;

public class Student {
  

public String sno;
  public String sname;
  public String ssubject;
  public Student(String sno, String sname , String ssubject)

  {
	  this.sno =sno;
	  this.sname =sname;
	  this.ssubject =ssubject;
  }
  public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsubject() {
		return ssubject;
	}
	public void setSsubject(String ssubject) {
		this.ssubject = ssubject;
	}









}
