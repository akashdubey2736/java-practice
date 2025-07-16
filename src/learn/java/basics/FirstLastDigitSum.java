package learn.java.basics;

public class FirstLastDigitSum {
	
	public static int sumFirstLastDigit(int number) {
		if(number<0) {
			return -1;
		}
		
		else {
			int lastDigit=number%10;
			int firstDigit=0;
			while(number>0) {
				firstDigit=number%10;
				number=number/10;
			}
			return lastDigit+firstDigit;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumFirstLastDigit(1024));

	}

}
