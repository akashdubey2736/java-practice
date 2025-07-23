package practice.java.basics;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(int number) {
		if (number<0) {
			return false;
		}
		
		int perfectNumber=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				perfectNumber+=i;
			}
		}
		if(perfectNumber==number) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(8));

	}

}
