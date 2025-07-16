package learn.java.oop.compositionandencapsulation;

public class SmartkitchenRunner {
	
	public static void main(String[] args) {
		
		SmartKitchen kitchen=new SmartKitchen();
		
//		kitchen.getBrewMaster().sethasWorkToDo(true);
//		kitchen.getDishWasher().sethasWorkToDo(true);
//		kitchen.getIceBox().sethasWorkToDo(true);
//		kitchen.getBrewMaster().brewCoffee();
//		kitchen.getDishWasher().doDishes();
//		kitchen.getIceBox().orderFood();
		
		kitchen.setKitchenState(true, true, true);
		kitchen.doKitchenWork();
	}

}
