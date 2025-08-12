package practice.java.collections.cardgame;

public enum CardType {

	
	CLUB,DIAMOND,HEART,SPADE;
	
	public char getImage() {
		return(new char[] {9827,9830,9829,9824}[this.ordinal()]); 
	}
}
