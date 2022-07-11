package com.sonata;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int stdid;
	private String stdname;
	private int marks;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student: stdid=" + stdid + ", stdname=" + stdname + ", marks=" + marks + "";
	}
	public Student(int stdid, String stdname, int marks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.marks = marks;
	}
	
}
