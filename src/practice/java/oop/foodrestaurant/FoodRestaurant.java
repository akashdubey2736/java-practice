package practice.java.oop.foodrestaurant;

public class FoodRestaurant {

	public static void main(String[] args) {
	

//		MealOrder regularMeal=new MealOrder();
//		regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//		regularMeal.setDrinkSize("LARGE");
//		regularMeal.printItemizedList();
		
//		MealOrder secondMeal=new MealOrder("turkey","7-up","chili");
//		secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//		secondMeal.setDrinkSize("SMALL");
//		secondMeal.printItemizedList();
		
		MealOrder deluxeMeal=new MealOrder("deluxe","7-up","chili");
		deluxeMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO","AVACADO","BACON");
		deluxeMeal.setDrinkSize("SMALL");
		deluxeMeal.printItemizedList();

	}

}	
