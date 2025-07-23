package practice.java.basics;

public class FlexlengthArrays {

	public static void main(String[] args) {
		
		System.out.println("Hello World again");
		
		String[] splitStrings="Hello world again".split(" ");
		printText(splitStrings);
		
		printText("Hello","World");

	}
	
	private static void printText(String... textList) {
		for(String t : textList) {
			System.out.println(t);
		}
	}

}
