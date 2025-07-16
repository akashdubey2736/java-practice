package learn.java.oop.compositionandencapsulation;

public class SmartKitchen {
	
	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator iceBox;
	
	public SmartKitchen() {
		 brewMaster=new CoffeeMaker();
		 dishWasher=new DishWasher();
		 iceBox=new Refrigerator();
		
	}
	
	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}

	public Refrigerator getIceBox() {
		return iceBox;
	}

	public void addWater() {
		brewMaster.sethasWorkToDo(true);
	}
	
	public void pourMilk() {
		iceBox.sethasWorkToDo(true);
	}
	
	public void loadDishwasher() {
		dishWasher.sethasWorkToDo(true);
	}
	
	public void setKitchenState(boolean coffeeFlag,boolean dishFlag, boolean iceBoxFlag) {
		brewMaster.sethasWorkToDo(coffeeFlag);
		dishWasher.sethasWorkToDo(dishFlag);
		iceBox.sethasWorkToDo(iceBoxFlag);
	}
	
	public void doKitchenWork() {
		brewMaster.brewCoffee();
		dishWasher.doDishes();
		iceBox.orderFood();
		
	}
	
}


class Refrigerator extends Appliances{
	
	
	public void orderFood() {
		if(gethasWorkToDo()) {
		System.out.println("Food ordered!");
		}
		
	}
}

class DishWasher extends Appliances {
	
	public void doDishes() {
		if(gethasWorkToDo()) {
		System.out.println("Dishes done!");
		}
		
	}
}

class CoffeeMaker extends Appliances {
	
	public void brewCoffee() {
		if(gethasWorkToDo()) {
		System.out.println("Coffee brewed!");
		}
		
	}
}