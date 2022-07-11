package company;
import java.util.Scanner;
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Company's Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Company's Address: ");
				String add=sc.nextLine();
				System.out.println("Enter the Company's Phone number: ");
				long pnumber=sc.nextLong();
				System.out.println("Enter the Company's FaxNumber: ");
				long fnumber=sc.nextLong();
				System.out.println("enter company's website: ");
				String wsite = sc.next();
				System.out.println("Enter the Manager's Name: ");
				String mName=sc.next();
				System.out.println("Enter the Manager's SurName: ");
				String msurname=sc.next();
				System.out.println("Enter the Manager's Phone number: ");
				long mNumber=sc.nextLong();
				System.out.println("Company: "+name);
				System.out.println("Company's Address: "+add);
				System.out.println("Company's PhoneNumber: "+pnumber);
				System.out.println("Company's FaxNumber: "+fnumber);
				System.out.println("Company's Website: "+wsite);
				System.out.println("Manager Name: "+mName+" "+msurname);
				System.out.println("PhoneNumber: "+mNumber);
			}

		}

	
