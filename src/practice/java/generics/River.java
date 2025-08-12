package practice.java.generics;

public class River extends Line{
	
	String name;
	String location;
	
	public River(String name, String... locations) {
		super(locations);
		this.name = name;
	}
	
	public String toString() {
		return name + " River";
	}

}
