package practice.java.oop.classandinheritence;

public class Cuboid extends Rectangle{
	
	private double height;

	public Cuboid(double width, double length, double height) {
		super(width, length);
		if(height<0) {
			this.height = 0;
			
		}
		else {
			this.height = height;
			
		}
		
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return this.height*getArea();
	}

}
