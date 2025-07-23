package practice.java.basics;
import java.math.*;

public class AreaCalculator {
	
	public static double area(double radius) {
		if(radius<0) {
			return -1;
		}
		else {
			return Math.PI*(radius*radius);
			
		}
	}
	
	public static double area(double x,double y) {
		if(x<0 || y<0) {
			return -1;
		}
		else {
			return x*y;
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Area is : "+area(5.0));
		System.out.println("Area is : "+area(5.0,5.0));

	}

}
