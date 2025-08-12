package practice.java.collections.cardgame;

import java.util.ArrayList;
import java.util.List;

public class CardDeck extends Card {
	
	
		
	public static List<Card> getCardDeck() {
		List<Card> cardDeck=new ArrayList<>(52);
		for(CardType suit : CardType.values()) {
			for(int i=2;i<11;i++) {
				cardDeck.add( Card.getCardByNumber(suit,i));		
			}
			for(char c : new char[] {'J','Q','K','A'}) {
				cardDeck.add( Card.getCardByFace(suit,c));
				
			}
		}
		return cardDeck;
		
	}
	
	public static void printCardDeck(List<Card> cardDeck) {
		for(Card card : cardDeck) {
			System.out.print(card);
			
		}
		
	}
		

}
