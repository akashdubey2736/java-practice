package learn.java.basics;

public class NumberPalindrome {
	
	public static boolean isPalindrome(int number) {
		int reversedNumber=0;
		int originalNumber=number;
		while(number>0) {
			reversedNumber=(number%10)+10*reversedNumber;
			number=number/10;
			
		}
		return originalNumber==reversedNumber;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1213));

	}

}
