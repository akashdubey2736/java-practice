package practice.java.collections.lists.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

record Places(String name, int distance) {};

public class TravelItinerary {

	public static void main(String[] args) {
		
		LinkedList<Places> placesToVisit=new LinkedList<>();
		Places adelaide=new Places("Adelaide",1374);
		addPlace(placesToVisit,adelaide);
		addPlace(placesToVisit, new Places("Brisbane",916));
		addPlace(placesToVisit, new Places("Perth",3923));
		addPlace(placesToVisit, new Places("Alice Springs",2771));
		addPlace(placesToVisit, new Places("Darwin",3972));
		addPlace(placesToVisit, new Places("Melbourne",817));
		placesToVisit.addFirst(new Places("Sydney",0));
		
		
		var iterator=placesToVisit.listIterator();
		Scanner scanner=new Scanner(System.in);
		boolean quitLoop=false;
		boolean forward=true;
		
		
		while(!quitLoop) {
			if(!iterator.hasPrevious()) {
				System.out.println("Originating: "+iterator.next());
				forward=true;
			}
			if(!iterator.hasNext()) {
				System.out.println("Final: "+iterator.previous());
				forward=false;
			}
			System.out.print("Enter Value:");
			String menuItem=scanner.nextLine().toUpperCase().substring(0,1);
			switch(menuItem) {
			case "F":
				if(!forward) {
					forward=true;
					if(iterator.hasNext()) {
						iterator.next();
					}
				}
				System.out.println("User wants to go forward");
				if(iterator.hasNext()){
					System.out.println(iterator.next());
				}
				break;
			case "B":
				System.out.println("User wants to go backward");
				if(forward) {
					forward=false;
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
				}
				if(iterator.hasPrevious()){
					System.out.println(iterator.previous());
				}
				break;
			case "M":
				printMenu();
				break;
			case "L":
				System.out.println(placesToVisit);
				break;
			default:
				quitLoop=true;
				break;
			}
		}
	}
	
	private static void addPlace(LinkedList<Places> list, Places place) {
		
		if(list.contains(place)) {
			System.out.println("Found duplicate"+place);
			return;
		}
		
		for(Places p : list) {
			if(p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Found duplicate"+place);
				return;
			}
		}
		int matchedIndex=0;
		for(var listPlace: list) {
			if(place.distance()<listPlace.distance()) {
				list.add(matchedIndex,place);
				return;
			}
			matchedIndex++;
		}
		list.add(place);
		
	}
	
	
	private static void printMenu() {
		System.out.println("""
				Available actions (select word or letter);
				(F)orward
				(B)ackward
				(L)ist Places
				(M)enu
				(Q)uit""");
	}

}
