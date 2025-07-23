package practice.java.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){
	
	public GroceryItem(String name) {
		this(name,"DAIRY",1);
	}
	
	
}

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<GroceryItem> groceryList=new ArrayList<>();
		groceryList.add(new GroceryItem("Butter"));
		groceryList.add(new GroceryItem("Milk"));
		groceryList.add(new GroceryItem("Oranges","PRODUCE",5));
		System.out.println(groceryList);
		groceryList.set(0,new GroceryItem("Apples","PRODUCE",6));
		System.out.println(groceryList);
		groceryList.remove(0);
		System.out.println(groceryList);
		
		String[] items= {"Apples","Banana","Milk","Eggs"};
		List<String>list=List.of(items);
		System.out.println(list);
		ArrayList<String> groceries=new ArrayList<>(list);
		groceries.add("Yogurt");
		System.out.println(groceries);
		
		ArrayList<String> nextList=new ArrayList<>(List.of("Pickles","Mustard","Cheese"));
		System.out.println(nextList);
		
		groceries.addAll(nextList);
		System.out.println(groceries);
		
		System.out.println("Third item : "+groceries.get(2));
		
		if(groceries.contains("Mustard")) {
			System.out.println("List contains Mustard");
		}
		
		groceries.add("Yogurt");
		System.out.println("first: "+groceries.indexOf("Yogurt"));
		System.out.println("first: "+groceries.lastIndexOf("Yogurt"));
		
		System.out.println(groceries);
		
		groceries.remove(1);
		System.out.println(groceries);
		
		groceries.remove("Yogurt");
		System.out.println(groceries);
		
		groceries.removeAll(List.of("Apples","Eggs"));
		System.out.println(groceries);
		
		groceries.retainAll(List.of("Apples","Milk","Mustard","Cheese"));
		System.out.println(groceries);
		
		groceries.clear();
		System.out.println(groceries);
		System.out.println("isEmpty :"+groceries.isEmpty());
		
		groceries.addAll(List.of("Apples","Milk","Mustard","Cheese"));
		groceries.addAll(Arrays.asList("Eggs","Pickles","Mustard","Ham"));
		System.out.println(groceries);
		
		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);
		
		groceries.sort(Comparator.reverseOrder());
		System.out.println(groceries);
	}

}
