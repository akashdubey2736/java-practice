package practice.java.oop.foodrestaurant;

public class Item {
	
	
	private String type;
	private String name;
	private double price;
	private String size="MEDIUM";
	
	public Item(String type, String name, double price) {
		super();
		this.type = type.toUpperCase();
		this.name = name.toUpperCase();
		this.price = price;

	}
	

	public String getName() {
		if(type.equals("SIDE")|| type.equals("DRINK")) {
			
			return size + " " +name;
			
		}
		return name;
	}
	

	protected double getBasePrice() {
		return price;
		
	}
	
	protected double getAdjustedPrice() {
		return switch(size) {
		case "SMALL" -> getBasePrice()-0.50;
		case "LARGE" -> getBasePrice()+1;
		default->getBasePrice();
		
		};
		
	}
	
	public void setSize(String size) {
		this.size=size;
		
	}
	
	public static void  printItem(String name,double price) {
		System.out.printf("%20s:%6.2f%n",name,price);
		
	}
	
	public void printItem() {
		printItem(getName(),getAdjustedPrice());
	}	
	
}


