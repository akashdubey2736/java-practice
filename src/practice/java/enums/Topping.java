package practice.java.enums;

public enum Topping {
	MUSTARD,
	PICKLES,
	BACON,
	CHEDDAR,
	TOMATO;
	
	public double getPrice() {
		return switch(this) {
		case BACON->1.5;
		case PICKLES->2.00;
		default->0.50;
		};
	}
	
}
