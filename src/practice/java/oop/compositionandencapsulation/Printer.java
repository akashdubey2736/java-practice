package practice.java.oop.compositionandencapsulation;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	public int getTonerLevel() {
		return tonerLevel;
	}


	public boolean isDuplex() {
		return duplex;
	}

	private boolean duplex;
	
	public Printer(int tonerLevel,boolean duplex) {
		this.pagesPrinted=0;
		this.tonerLevel=(tonerLevel>=0 && tonerLevel<100) ? tonerLevel :-1;
		this.duplex=duplex;
	}
	
	
	public int addToner(int tonerAmount) {
		int tempAmount=tonerAmount+tonerLevel;
		
		if(tempAmount>100 || tempAmount<0) {
			return -1;
		}
		this.tonerLevel+=tempAmount;
		return tonerLevel;
		
	}
	
	public int printPages(int pages){
		int jobPages=(duplex)?(pages/2)+(pages%2):pages;
		pagesPrinted+=jobPages;
		return jobPages;
		
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}

}
