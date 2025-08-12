package practice.java.oop.abstractionandinterfaces.storefront;

import java.util.ArrayList;
import java.util.Comparator;

public class Store {
	
	private static ArrayList<ProductForSale> productsForSale=new ArrayList<>();
	
	
	public static void  displayOrders() {
		for(var item: productsForSale) {
			System.out.println("-".repeat(30));
			item.showDetails();
		}
	}
		
	
	public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int quantity) {
		order.add(new OrderItem(quantity,productsForSale.get(orderIndex)));
	}
	
	public static void printOrder(ArrayList<OrderItem> order) {
		double salesTotal=0;
		for(var item : order) {
			item.getProductForSale().printPricedItem(item.getQuantity());
			salesTotal+=item.getProductForSale().getSalesPrice(item.getQuantity());
		}
		
		System.out.printf("SalesTotal = $%6.2f %n",salesTotal);
	}
			

	public static void main(String[] args) {
		
		productsForSale.add(new Phone("Apple",1000.00,"Apple 15 Pro"));
		productsForSale.add(new Laptop("Asus",3000.00,"Asus NextGen Pro"));
		displayOrders();
		System.out.println("\n Order 1");
		var order1=new ArrayList<OrderItem>();
		addItemToOrder(order1,1,2);
		addItemToOrder(order1,0,1);
		printOrder(order1);
	}
		
		
}
