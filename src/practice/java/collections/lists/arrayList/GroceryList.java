package practice.java.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GroceryList {
	
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args)  {
		
		
		ArrayList<String> groceryList=new ArrayList<>();
		
		boolean flag=true;
		while(flag) {
			printActions();
			switch(Integer.parseInt(scanner.nextLine())) {
			case 1->addItems(groceryList);
			case 2->removeItems(groceryList);
			default->flag=false;
			}
			groceryList.sort(Comparator.naturalOrder());
			System.out.println(groceryList);
		}	

	}
	
	private static void addItems(ArrayList<String> groceryList) {
		System.out.println("Add item(s) [seperate items by comma]:");
		String[] items=scanner.nextLine().split(",");
		for (String i : items) {
			String trimmed=i.trim();
			if(groceryList.indexOf(trimmed)<0) {
				groceryList.add(trimmed);
			}
		}
		
	}
	
	private static void removeItems(ArrayList<String> groceryList) {
		System.out.println("Remove item(s) [seperate items by comma]:");
		String[] items=scanner.nextLine().split(",");
		for (String i : items) {
			String trimmed=i.trim();
			groceryList.remove(trimmed);
			
		}
		
	}
	
	private static void printActions() {
		String textBlock="""
				Available actions :
				0 - to shutdown
				1 - to add item(s) to list( comma delimited list)
				2 - to remove any items( comma delimited list)
				Enter a number for which action you want to do :
				""";
		System.out.println(textBlock + " ");
	}

}
