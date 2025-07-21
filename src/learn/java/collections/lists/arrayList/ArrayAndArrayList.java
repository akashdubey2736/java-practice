package learn.java.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> groceries=new ArrayList<>();
		
		groceries.addAll(Arrays.asList("Eggs","Pickles","Mustard","Ham"));
		System.out.println(groceries);
		
		var groceryArray=groceries.toArray(new String[groceries.size()]);
		System.out.println(Arrays.toString(groceryArray));
		
		String[] originalArray=new String[] {"First","Second","Thrid"};
		var originalList=Arrays.asList(originalArray);
		
		originalList.set(0,"One");
		System.out.println("List : "+originalList);
		System.out.println("Array : "+Arrays.toString(originalArray));
	}

}
