package practice.java.collections.deckofcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Card[] cardArray= new Card[13];
		Card aceOfHearts=Card.getFaceCard(Card.Suit.HEART, 'A');
		Arrays.fill(cardArray,aceOfHearts);
		Card.printDeck(Arrays.asList(cardArray),"Aces of hearts",1);
		
		List<Card> cards=new ArrayList<>(52);
		Collections.fill(cards, aceOfHearts);
		System.out.println(cards);
		System.out.println("cards.size() = "+cards.size());
		
		List<Card> acesOfHearts=Collections.nCopies(13, aceOfHearts);
		Card.printDeck(acesOfHearts,"Aces of Hearts",1);
		
		Card KingOfClubs=Card.getFaceCard(Card.Suit.CLUB, 'K');
		
		List<Card> KingsOfClubs=Collections.nCopies(13, KingOfClubs);
		Card.printDeck(KingsOfClubs,"Kings of Clubs",1);
		
		Collections.addAll(cards, cardArray);
		Card.printDeck(cards,"Card collection with Aces added",1);
		
		Collections.copy(cards, KingsOfClubs);
		Card.printDeck(cards,"Card collection with Kings copied",1);
		
		List<Card> deck=Card.getStandardDeck();
		Card.printDeck(deck);
		
		Collections.shuffle(deck);
		Card.printDeck(deck,"Shuffled deck",4);
		
		Collections.reverse(deck);
		Card.printDeck(deck,"reversed deck",4);
		
		var sortingAlgorithm=Comparator.comparing(Card::rank).thenComparing(Card::suit);
		Collections.sort(deck,sortingAlgorithm);
		Card.printDeck(deck,"Standard Sorted deck",13);
		
		Collections.reverse(deck);
		Card.printDeck(deck,"Sorted by rank, suit reversed",13);
		
		List<Card> kings=new ArrayList<>(deck.subList(4, 8));
		Card.printDeck(kings,"kings in deck",1);
		
		List<Card> tens=new ArrayList<>(deck.subList(16, 20));
		Card.printDeck(tens,"kings in deck",1);
		
		int subListIndx=Collections.indexOfSubList(deck, tens);
		System.out.println("sublist index for tens = "+subListIndx);
		
		System.out.println("Contains = "+deck.containsAll(tens));
		
		boolean disJoint=Collections.disjoint(deck, tens);
		System.out.println("disjoint = "+disJoint);
		
		
		System.out.println("-------------------->");
		deck.sort(sortingAlgorithm);
		Card tenOfHearts=Card.getNumericCard(Card.Suit.HEART, 10);
		int foundIndex=Collections.binarySearch(deck, tenOfHearts,sortingAlgorithm);
		System.out.println("foundIndex = "+foundIndex);
		System.out.println(deck.get(foundIndex));
		
		
		Card tenOfClubs=Card.getNumericCard(Card.Suit.CLUB, 10);
		Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
		Card.printDeck(deck.subList(32,36),"Tens row",1);
		
		Collections.replaceAll(deck,tenOfHearts,tenOfClubs);
		Card.printDeck(deck.subList(32,36),"Tens row",1);
		
		System.out.println("Ten of Clubs Card = "+Collections.frequency(deck, tenOfClubs));
		
		System.out.println("Best Card = " + Collections.max(deck,sortingAlgorithm));
		System.out.println("Worst Card = " + Collections.min(deck,sortingAlgorithm));
		
		var sortBySuit=Comparator.comparing(Card::suit).thenComparing(Card::rank);
		deck.sort(sortBySuit);
		Card.printDeck(deck,"Sorted by suit = ",4);
		
		List<Card> copied=new ArrayList<>(deck.subList(0, 13));
		Collections.rotate(copied, 2);
		System.out.println("UnRotated "+deck.subList(0, 13));
		System.out.println("Rotated "+ 2 +":" +copied);
		
	    copied=new ArrayList<>(deck.subList(0, 13));
		Collections.rotate(copied, -2);
		System.out.println("UnRotated "+deck.subList(0, 13));
		System.out.println("Rotated "+ -2 +":" +copied);
		
		copied=new ArrayList<>(deck.subList(0, 13));
		for(int i=0;i<copied.size()/2;i++) {
			Collections.swap(copied, i, copied.size()-1-i);
		}
		System.out.println("Manual Reverse: "+copied);
		
	}

}
