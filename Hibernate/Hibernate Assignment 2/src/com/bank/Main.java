package com.bank;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails bd1= new BankDetails(123456789,"HDFC Bank","Aditya S A");
		SavingsAccountCurrentAccount s1 = new SavingsAccountCurrentAccount(12345789,"HDFC Bank","Aditya S A","Savings",98765432);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		s.beginTransaction();
		s.save(bd1);
		s.save(s1);
		s.getTransaction().commit();
		s.close();
	}
}
