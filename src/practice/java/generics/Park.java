package practice.java.generics;

public class Park extends Point{
	
	String name;
	String location;
	
	public Park(String name, String location) {
		super(location);
		this.name = name;
	}
	
	public String toString() {
		return name + " National Park";
	}
	

}
