package practice.java.oop.abstractionandinterfaces.storefront;

public class Laptop extends ProductForSale{

	public Laptop(String type, double price, String description) {
		super(type, price, description);
		// TODO Auto-generated constructor stub
	}

	public void showDetails() {
		System.out.println("Product Type : "+type+" Price : "+price+" Description :  "+description);
		
	}

}
