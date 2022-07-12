package com.main;

import com.daoimpl.Studentimpl;
import com.model.Student;
public class InsertDB {

	public static void main(String[] args) {
		Student s1 = new Student(12,"Aditya",95);
		
		Studentimpl si1 = new Studentimpl();
		int a1 = si1.save(s1);
		System.out.println(a1);
	}
}
