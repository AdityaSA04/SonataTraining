package com.sonata;

public class Main {

	public static void main(String[] args) {
		 Address addr1 = new Address("aditya@gmail.com", "S A", "Aditya","Bangalore","Bangalore","Karnataka","India",560064);
		 Address addr2 = new Address("harsh@gmail.com", "Singh", "Harsh","Mumbai","Mumbai","Maharashtra","India",214561);
		 Address addr3 = new Address("darshit@gmail.com", "Kumar", "Darshit","Indore","Indore","MadhyaPradesh","India",256789);
		 Address addr4 = new Address("anish@gmail.com", "Singh", "anish","Patna","Patna","Bihar","India",146789);
		 Address addr5 = new Address("nihal@gmail.com", "reddy", "Nihal",",Mysore","Mysore","Karnataka","India",600645);
		 AddressBook ab = new AddressBook();
		ab.add(addr1);
		ab.add(addr2);
		ab.add(addr3);
		ab.add(addr4);
		ab.add(addr5);
		ab.view();
		ab.removeAddress(addr1);
		ab.view();
		ab.search("aditya@gmail.com");
	}

}
