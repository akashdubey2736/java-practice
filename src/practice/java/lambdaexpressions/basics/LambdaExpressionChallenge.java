package practice.java.lambdaexpressions.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaExpressionChallenge {
	
	private static Random random=new Random();

	public static void main(String[] args) {
		
		String[] names={"Anna","Bob","Mark","Nathan"};
		Arrays.setAll(names, i->names[i].toUpperCase());
		System.out.println("-->Transform to UpperCase");
		System.out.println(Arrays.toString(names));
		
		
		List<String> backedByArray=Arrays.asList(names);
		
		backedByArray.replaceAll(s->s+" "+ getRandomChar('A','D')+".");
		System.out.println("-->Add random middle intial");
		System.out.println(Arrays.toString(names));
		
		backedByArray.replaceAll(s->s+" "+ getReversedName(s.split(" ")[0]));
		System.out.println("-->Add reversed name as last name");
		Arrays.asList(names).forEach(s->System.out.println(s));
		
		List<String> newList=new ArrayList(List.of(names));
		newList.removeIf(s->s.substring(0,s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") +1
				)));
		
		System.out.println("-->Remove name where first=last");
		newList.forEach(s->System.out.println(s));
	}
	
	
	public static char getRandomChar(char startChar, char endChar) {
		return (char) random.nextInt((int) startChar,(int) endChar+1);
	}
	
	public static String getReversedName(String firstName) {
		return new StringBuilder(firstName).reverse().toString();
	}

}
