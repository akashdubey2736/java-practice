package practice.java.oop.foodrestaurant;

public class Burger extends Item{
	
    private Item extra1;
	private Item extra2;
	private Item extra3;
	
	public Burger(String name, double price) {
		super("Burger", name, price);
	}
	
	public String getName() {
		return super.getName() + " BURGER";
	}
	
	public double getAdjustedPrice() {
		return getBasePrice() + 
				((extra1==null)?0:extra1.getAdjustedPrice())+
				((extra2==null)?0:extra1.getAdjustedPrice())+
				((extra3==null)?0:extra1.getAdjustedPrice());
				
	}
	
	public double getExtraPrice(String toppingName) {
		return switch(toppingName.toUpperCase()) {
		case "AVACADO","CHEESE"->1.0;
		case "BACON","HAM","SALAMI"->1.5;
		default->0.0;
		
		};
	}
	
	public void addToppings(String extra1,String extra2,String extra3) {
		this.extra1=new Item("TOPPING",extra1,getExtraPrice(extra1));
		this.extra2=new Item("TOPPING",extra2,getExtraPrice(extra2));
		this.extra3=new Item("TOPPING",extra3,getExtraPrice(extra3));
	}
	
	public void printItemizedList() {
		printItem("Base BURGER",getBasePrice());
			if(extra1!=null) {
				extra1.printItem();
			}
			if(extra2!=null) {
				extra2.printItem();
			}
			if(extra3!=null) {
				extra3.printItem();
			}
		
	}
	
	public void printItem() {
		printItemizedList();
		System.out.println("-".repeat(30));
		super.printItem();
	}

}


