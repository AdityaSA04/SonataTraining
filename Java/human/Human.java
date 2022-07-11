package human;

class Human {
	protected String fname;
	protected String lname;
	
	public Human(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
	}
	
	public Human()
	{
		super();
	}
	public String getFName() {
		return fname;
	}
	public String getLName(){
		return lname;
	}
	public void setFname(String fname) {
		this.fname=fname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
}

class Student extends Human{
	private int mark;
	
	public Student(int mark) {
		this.mark = mark;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
class Worker extends Human{
	private int wage;
	private int hours;
	
	public Worker(int wage, int hours) {
		this.wage = wage;
		this.hours = hours;
	}
	public int getWage() {
		return wage;
	}
	public int getHours() {
		return hours;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
}

interface HourlyWage{
	public double calculateWage(int wage, int hours);
}
class calcWage  implements HourlyWage{
	public double calculateWage(int wage, int hours) {
		double ret=(wage/hours);
		return ret;
	}
}

