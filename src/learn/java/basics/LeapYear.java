package learn.java.basics;

public class LeapYear {
	
	public static boolean isLeapYear(int year) {
		if(year%4==0) {
			if(year%100!=0) {
				return true;
			}
			else {
				if(year%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
			
		}
		else {
			return false;
		}
		
		}

	public static void main(String[] args) {
		System.out.println(isLeapYear(2024));

	}

}
