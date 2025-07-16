package learn.java.basics;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		long firstRounded=(long)(num1*1000);
		long secondRounded=(long)(num1*1000);
		return firstRounded==secondRounded;
		
	}

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.175,-3.175));
		

	}

}
