package practice.java.basics;

public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
		if(hourOfTheDay<0 || hourOfTheDay>23) {
			System.out.println("Invalid hours!!");
			return false;

		}
		else if(barking==true && (hourOfTheDay <8 || hourOfTheDay>22)) {
			return true;
			
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true,7));

	}

}
