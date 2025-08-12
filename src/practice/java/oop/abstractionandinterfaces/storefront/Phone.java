package practice.java.oop.abstractionandinterfaces.storefront;

public class Phone extends ProductForSale{

	public Phone(String type, double price, String description) {
		super(type, price, description);
	}

	public void showDetails() {
		System.out.println("Product Type : "+type+" Price : "+price+" Description :  "+description);
		
	}

}
