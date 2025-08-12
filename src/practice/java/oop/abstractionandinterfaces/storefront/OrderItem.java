package practice.java.oop.abstractionandinterfaces.storefront;

public class OrderItem {
	
	private int quantity;
	private ProductForSale productForSale;
	
	public OrderItem(int quantity, ProductForSale productForSale) {
		super();
		this.quantity = quantity;
		this.productForSale = productForSale;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public ProductForSale getProductForSale() {
		return productForSale;
	}

	
	

}
