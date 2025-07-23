package practice.java.basics;
import java.math.*;

public class SpeedConvertor {

	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour<0){
			return -1;
		}
		else {
			return Math.round(kilometersPerHour*0.62137);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(toMilesPerHour(10));

	}

}
