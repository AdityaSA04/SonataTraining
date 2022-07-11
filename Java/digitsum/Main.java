package digitsum;

public class Main {

	public static void main(String[] args) {
		Operations o=new Operations();
		System.out.println("Sum of Digits of  is: "+o.sumOfDigits(1234));
		System.out.println("Reverse of digits is: "+o.reverse(1234));
		System.out.println("Last digit to first is: "+o.lastDigitInFirst(1234));
	}

}
