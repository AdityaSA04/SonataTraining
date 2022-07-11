package com.sonata;

import org.hibernate.cfg.Configuration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		s.beginTransaction();
		Student s1 = new Student(1,"Aditya",95);
		Student s2 = new Student(2,"Darshit",93);
		Student s3 = new Student(3,"Harsh",76);
		Student s4 = new Student(4,"Hari",84);
		Student s5 = new Student(7,"Sumedha",54);
		Student s6 = new Student(9,"Sriraksha",31);
		Student s7 = new Student(11,"Sumit",55);
		Student s8 = new Student(13,"Yazvi",54);
		Student s9 = new Student(15,"Ayushi",45);
		Student s10 = new Student(17,"Ana",75);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		s.save(s6);
		s.save(s7);
		s.save(s8);
		s.save(s9);
		s.save(s10);
		Query q1 = s.createQuery("select max(marks) from Student");
		//Query q2 = s.createQuery("select marks from Student group by marks having count(*)>1");
		//Query q3 = s.createQuery("select stdname from Student where marks between 80 and 90");
		//Query q4 = s.createQuery("select stdname from Student where stdname like 'S%'");
		List list = q1.list();
		//List list = q2.list();
		//List list = q3.list();
		//List list = q4.list();
		
		System.out.println(list);
		s.getTransaction().commit();
		s.close();
	}

}
