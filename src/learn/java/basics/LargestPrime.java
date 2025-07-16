package learn.java.basics;

public class LargestPrime {
	
	public static boolean isPrime(int number) {
		for(int j=2;j<number/2;j++) {
			if(number%j==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getLargestPrime(int number) {
		if(number<0) {
			return -1;
		}
		
		int largestPrime=0;
		for(int i=2;i<number/2;i++) {
			if(number%i==0 && isPrime(i)) {
				largestPrime=i;
			}
			
		}
		return largestPrime;
	}

	public static void main(String[] args) {
		System.out.println(getLargestPrime(217));

	}

}
