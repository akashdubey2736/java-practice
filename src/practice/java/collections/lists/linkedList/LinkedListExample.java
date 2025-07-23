package practice.java.collections.lists.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//LinkedList<String> placesToVisit=new LinkedList<>();
		
		var placesToVisit= new LinkedList<String>();
		placesToVisit.add("Sydney");
		placesToVisit.add(0,"Canberra");
		System.out.println(placesToVisit);
		addMoreElement(placesToVisit);
		System.out.println(placesToVisit);
		//removeMoreElement(placesToVisit);
		System.out.println(placesToVisit);
		gettingElements(placesToVisit);
		printItinerary(placesToVisit);
		printItinerary2(placesToVisit);
		printItinerary3(placesToVisit);
		testIterator(placesToVisit);
	

	}
	
	private  static void addMoreElement(LinkedList<String> list) {
		list.addFirst("Darwin");
		list.addLast("Hobart");
		
		list.offer("Melbourne");
		list.offerFirst("Brisbane");
		list.offerLast("Toowoomba");
		
		list.push("Alice Springs");
		
	}
	
	private  static void removeMoreElement(LinkedList<String> list) {
		list.remove(4);
		list.remove("Brisbane");
		
		String s1=list.remove();
		System.out.println(s1+ " was removed");
		
		String s2=list.removeFirst();
		System.out.println(s2+ " was removed");
		
		String s3=list.removeLast();
		System.out.println("Last element was removed");
		
		String p1=list.poll();
		System.out.println(p1+ " was removed");
		
		String p2=list.pollFirst();
		System.out.println(p2+ " was removed");
		
		String p3=list.pollLast();
		System.out.println("Last element was removed");
		
		
		list.push("Sydney");
		list.push("Brisbane");
		list.push("Canberra");
		
		String p4=list.pop();
		System.out.println(p4 +"  was removed");
	}
	
	private static void gettingElements(LinkedList<String> list) {
		System.out.println("Retrieved elelemnt : "+list.get(4));
		
		System.out.println("Retrieved elelemnt : "+list.getFirst());
		System.out.println("Retrieved elelemnt : "+list.getLast());
		
		System.out.println("Darwin is at position : "+list.indexOf("Darwin"));
		System.out.println("Melbourne is at position : "+list.lastIndexOf("Melbourne"));
		
		System.out.println("Element from element() : "+list.element());
		System.out.println("Element from peek() : "+list.peek());
		System.out.println("Element from peekFirst() : "+list.peekFirst());
		System.out.println("Element from peekLast() : "+list.peekLast());
	}
	
	public static void printItinerary(LinkedList<String> list) {
		System.out.println("Trip starts at "+list.getFirst());
		for(int i=1;i<list.size();i++) {
			System.out.println("--> From : "+list.get(i-1)+" to " +list.get(i));
		}
		System.out.println("Trip ends at "+list.getLast());
	}
	
	public static void printItinerary2(LinkedList<String> list) {
		System.out.println("Trip starts at "+list.getFirst());
		String previousTown=list.getFirst();
		for(String town : list) {
			System.out.println("--> From : "+ previousTown+ " to "+town );
			previousTown=town;
		}
		System.out.println("Trip ends at "+list.getLast());
	}
	
	public static void printItinerary3(LinkedList<String> list) {
		System.out.println("Trip starts at "+list.getFirst());
		String previousTown=list.getFirst();
		ListIterator<String> iterator=list.listIterator(1);
		while(iterator.hasNext()) {
			var town=iterator.next();
			System.out.println("--> From : "+ previousTown+ " to "+town );
			previousTown=town;
		}
		System.out.println("Trip ends at "+list.getLast());
	}
	
	private static void testIterator(LinkedList<String> list) {
		var iterator=list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("Brisbane")) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
	}

}
