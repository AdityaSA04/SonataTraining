package human;

public class Main {

	public static void main(String[] args) {
		Human h1= new Human("Aditya", "S A");
		Student s1= new Student(99);
		Worker w1 = new Worker(360,12);
		HourlyWage c1=new calcWage();
		System.out.println("The hourly wage is "+ c1.calculateWage(920,12)+" rupees");

	}
}
