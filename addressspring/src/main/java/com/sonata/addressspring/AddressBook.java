package com.sonata.addressspring;
import java.util.ArrayList;
public class AddressBook {
	
		ArrayList<Address>l = new ArrayList<Address>();
		public AddressBook() {
			
		}
		public  void add(Address a)  {
			
					l.add(a);
				}

			
		public void removeAddress(Address a) {
			l.remove(a);
		}
		public void view() {
			System.out.println(l);
		}
		public void modify(String email, String lname, String fname, String address, String city, String state, String country,
				int pcode) {

	        String e=email;
	        String ln=lname;
	        String f=fname;
	        String ad=address;
	        String c=city;
	        String s1=state;
	        String c1=country;
	        int p=pcode;
	        int m=0;
	        boolean b1=ln.isBlank();
	        boolean b2=f.isBlank();
	        boolean b3=ad.isBlank();
	        boolean b4=c.isBlank();
	        boolean b5=s1.isBlank();
	        boolean b6=c1.isBlank();
			for (Address b:l) {
		        {
		            if(e==b.getEmail())
		            {
		                if(b1==false)
		                {
		                    b.setLname(ln);
		                    m=1;
		                }
		                if(b2==false)
		                {
		                    b.setFname(f);
		                    m=1;
		                }
		                if(b3==false)
		                {
		                    b.setAddress(ad);
		                    m=1;
		                }
		                if(b4==false)
		                {
		                    b.setCity(c);
		                    m=1;
		                }
		                if(b5==false)
		                {
		                    b.setState(s1);
		                    m=1;
		                }
		                if(b6==false)
		                {
		                    b.setCountry(c1);
		                    m=1;
		                }
		                if(p!=0)
		                {
		                    b.setPcode(p);
		                    m=1;
		                }
		                
		            }
		        }
		        if(m!=1)
		        {
		            System.out.println("Email Not Found");
		        }
		    }
		  
					
				}
		public void search(String email) {
			  for (Address b:l) {
				if(b.getEmail().toLowerCase().equals(email.toLowerCase()))
						{
					System.out.println("Address Found");
				}else {
					System.out.println("Address not found");
				}
			  }
		  }
	}
			



