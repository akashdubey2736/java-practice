package practice.java.oop.compositionandencapsulation;

public class PrinterRunner {

	public static void main(String[] args) {
		Printer printer=new Printer(50,true);

		System.out.println("Inital page count= "+printer.getPagesPrinted());
		int pagesPrinted=printer.printPages(5);
		System.out.printf("Current Job pages: %d, Printer Total : %d %n",pagesPrinted,printer.getPagesPrinted());
		
		pagesPrinted=printer.printPages(10);
		System.out.printf("Current Job pages: %d, Printer Total : %d %n",pagesPrinted,printer.getPagesPrinted());
		

	}

}
