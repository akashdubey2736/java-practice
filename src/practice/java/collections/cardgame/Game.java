package practice.java.collections.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game {
	
	

	public static void main(String[] args) {
		
		
		
		List<Card> deck=CardDeck.getCardDeck();
		
		CardDeck.printCardDeck(deck);
		System.out.println();
		System.out.println("Shuffeling...");
		Collections.shuffle(deck);
		CardDeck.printCardDeck(deck);
		System.out.println();
		System.out.println("Sorting...");
		CardDeck.printCardDeck(deck);
		System.out.println("Reversing...");
		Collections.reverse(deck);
		CardDeck.printCardDeck(deck);
		
		
	
	}

}


