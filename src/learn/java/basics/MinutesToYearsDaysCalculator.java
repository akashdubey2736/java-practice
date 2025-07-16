package learn.java.basics;

public class MinutesToYearsDaysCalculator {
	
	public static void yearsAndDays(long minutes) {
		
		if (minutes<0) {
			System.out.println("Invalid Value!!");
		}
		else {
			int days=(int)minutes/(60*24);
			int years=days/365;
			int remaingDays=days%365;
			
			System.out.println(minutes+"min="+years+"y and "+remaingDays+"d");
		}
		
	}

	public static void main(String[] args) {
		yearsAndDays(561600);
		

	}

}
