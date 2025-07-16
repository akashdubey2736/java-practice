package learn.java.basics;

public class FactorPrinter {
	
	public static void printFactors(int number) {
		if (number<0) {
			System.out.println("Invalid Number!!");
		}
		else {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		printFactors(32);

	}

}
