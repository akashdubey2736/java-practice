package practice.java.collections.cardgame;

import java.util.ArrayList;
import java.util.List;

class Card {
	
	CardType suit;
	String face;
	int rank;
	
	public Card() {
		
	}
	
	public Card(CardType suit,String face,int rank) {
		this.suit=suit;
		this.face=face;
		this.rank=rank;
	}
	
	public String toString() {
		return face+suit.getImage()+"("+rank+")";
	}
	
	public static Card getCardByNumber(CardType suit,int cardNumber) {
		if(cardNumber>=2 && cardNumber<11) {
		return new Card(suit,String.valueOf(cardNumber),cardNumber-1);
		}
		else {
			System.out.println("Invalid card number selected!!");
			return null;
		}
		
	}
	
	public static Card getCardByFace(CardType suit,char  name) {
		int charAtIndex="JQKA".indexOf(name);
		return new Card(suit,""+name,charAtIndex+10);
		
	}
	
}



