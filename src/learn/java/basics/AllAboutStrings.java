package learn.java.basics;

public class AllAboutStrings {

	public static void main(String[] args) {
		
		String birthDate="25/11/1982";
		int startingIndex=birthDate.indexOf("1982");
		System.out.println("statrtingIndex= "+startingIndex);
		System.out.println("birthYear= "+birthDate.substring(startingIndex));
		System.out.println("birthMonth= "+birthDate.substring(3,5));
		
		String newDate=String.join("/","25","11","1982");
		System.out.println("newDate= "+newDate);
		
		newDate="25";
		newDate=newDate.concat("/");
		newDate=newDate.concat("11");
		newDate=newDate.concat("/");
		newDate=newDate.concat("1982");
		System.out.println("neDate= "+newDate);
		
		newDate="25".concat("/").concat("11").concat("/").concat("1982");
		System.out.println("newDate= "+newDate);
		
		System.out.println(newDate.replace('/', '-'));
		System.out.println(newDate.replace("2", "00"));
		
		System.out.println(newDate.replaceFirst("/", "-"));
		System.out.println(newDate.replaceAll("/", "-"));
		
		System.out.println("ABC\n".repeat(3));
		System.out.println("-".repeat(20));
		
		System.out.println("ABC\n".repeat(3).indent(8));
		
		System.out.println("    ABC\n".repeat(3).indent(-2));
		
		
		printInformation("Hello World");
		printInformation("");
		printInformation("\t	\n");
		
		String helloWorld="Hellow World";
		System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
		System.out.printf("index of World = %d %n",helloWorld.indexOf("World"));
		
		System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
		System.out.printf("index of World = %d %n",helloWorld.lastIndexOf('l'));
		
		System.out.printf("index of l = %d %n",helloWorld.indexOf('l',3));
		System.out.printf("index of World = %d %n",helloWorld.lastIndexOf("l",8));
		
		String helloWorldLower=helloWorld.toLowerCase();
		if(helloWorld.equals(helloWorldLower)) {
			System.out.println("Values match extactly");
		}
		
		if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
			System.out.println("Values match extactly");
		}
		
		if(helloWorld.startsWith("Hello")){
			System.out.println("String starts with Hello");
		}
		
		if(helloWorld.endsWith("World")){
			System.out.println("String starts with World");
		}
		
		if(helloWorld.contains("World")){
			System.out.println("String contains word World");
		}
		
		if(helloWorld.contentEquals("Hello World")) {
			System.out.println("Values match extactly");
		}
		
		
	}
	
	public static void printInformation(String string) {
		int length=string.length();
		System.out.printf("Length= %d",length);
		
		if(string.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		if(string.isBlank()) {
			System.out.println("String is black");
		}
		
		System.out.printf("First char= %c %n",string.charAt(0));
		
		System.out.printf("First char= %c %n",string.charAt(length-1));
		
		
		
	}


}
