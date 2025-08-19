package practice.java.collections.invetorymanagement;

public class InventoryItem {
	
	private Product product;
	private double price;
	private int qtyTotal;
	private int qtyReserved;
	private int qtyReorder;
	private int qtyLow;
	
	public InventoryItem(Product product, double price, int qtyTotal,int qtyLow) {
		super();
		this.product = product;
		this.price = price;
		this.qtyTotal = qtyTotal;
		this.qtyLow = qtyLow;
		this.qtyReorder=qtyTotal;
	}
	
	public Product getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyTotal() {
		return qtyTotal;
	}

	public int getQtyReserved() {
		return qtyReserved;
	}

	public int getQtyReorder() {
		return qtyReorder;
	}

	public int getQtyLow() {
		return qtyLow;
	}
	
	public boolean reservedItem(int qty) {
		if((qtyTotal-qtyReserved)>=qty) {
			qtyReserved+=qty;
			return true;
		}else {
			return false;
		}
	}
		
		
	public void releaseItem(int qty) {
		qtyReserved-=qty;
	
	}
	
	public boolean sellItem(int qty) {
		if(qtyTotal>=qty) {
			qtyTotal-=qty;
			qtyReserved-=qty;
			if(qtyTotal<qtyLow) {
				placeInvetoryOrder();
				
			}
			return true;
		}
		return false;
	}
	
	private void placeInvetoryOrder() {
		System.out.printf("Ordering qty %d : %s%n",qtyReorder,product);
	}
	
	public String toString() {
		return "%s,$%.2f : [%04d,% 2d]".formatted(product,price,qtyTotal,qtyReserved);
	}
	
	


}
