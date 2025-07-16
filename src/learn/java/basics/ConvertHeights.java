package learn.java.basics;

public class ConvertHeights {
	
	public static double converToCentimeters(int value) {
		return (double)(value*2.54);
		
		
	}
	
	public static double converToCentimeters(int heightInFeet,int heightInInches) {
		int valueInInches=heightInFeet*12+heightInInches;
		return converToCentimeters(valueInInches);
		
	}

	public static void main(String[] args) {
		System.out.println("Value in Centimeters : "+converToCentimeters(10));
		System.out.println("Value in Centimeters : "+ converToCentimeters(5,8));
		

	}

}
