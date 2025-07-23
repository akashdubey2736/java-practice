package practice.java.oop.classandinheritence;

public class PointRunner {

	public static void main(String[] args) {
		
		Point first= new Point(6,5);
		Point second=new Point(3,1);
		
		System.out.println("Distnace(0,0) ="+ first.distance());
		System.out.println("Distnace(second) ="+ first.distance(second));
		System.out.println("Distance(2,2)= "+first.distance(2,2));
		
		Point point=new Point();
		System.out.println("Distance()= "+point.distance());

	}

}
