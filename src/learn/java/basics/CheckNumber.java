package learn.java.basics;

public class CheckNumber {
	
	public static void PositiveNegativeZero(int number) {
	if (number >0){
		System.out.println("Positive");
		
	}
	else if (number<0){
		System.out.println("Negative");
		
	}
	else {
		System.out.println("Zero");
	}
		}
	

	public static void main(String[] args) {
		PositiveNegativeZero(10);
		

	}

}
