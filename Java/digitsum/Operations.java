package digitsum;


public class Operations {
	int r,re,sum=0;
	int d;
	public int sumOfDigits(int num) {
		
		while(num > 0)  
		{  
			
		//finds the last digit of the given number    
		d = num % 10;  
		//adds last digit to the variable sum  
		sum = sum + d;  
		//removes the last digit from the number  
		num = num / 10;  
		}
		
		return sum;  
}
	public int reverse(int num) {
		while(num!=0) {
			r=num%10;
			re=re*10+r;
			num=num/10;
		}
		return re;
	}
	public String lastDigitInFirst(int num) {
		
		r=num%10; //holds last digit
		num=num/10; //holds first three digit
		String firstthree=String.valueOf(num);
		String last=String.valueOf(re);
	
	return last+firstthree;
}
}

	
