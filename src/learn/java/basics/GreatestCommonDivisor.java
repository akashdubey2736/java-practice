package learn.java.basics;

public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int num1, int num2) {
		if(num1<10 || num2<10) {
			return -1;
		}
		
		int min= num1<num2?num1:num2;
		int gcd=1;
		for(int i=1;i<=min;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		return gcd;
		
	}

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(12,30));

	}

}
