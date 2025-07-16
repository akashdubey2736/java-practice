package learn.java.oop.classandinheritence;

public class WallRunner {

	public static void main(String[] args) {
		Wall wall=new Wall(5.0,4.0);
		System.out.println("area= "+wall.getArea());
		
		wall.setHeight(-1.5);
		System.out.println("Width= "+wall.getWidth());
		
		System.out.println("Height= "+wall.getHeight());
		
		System.out.println("area= "+wall.getArea());

	}
	

}
