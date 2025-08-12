package practice.java.lambdaexpressions.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class BuiltInFunctions {

	public static void main(String[] args) {
		List <String> list=new ArrayList(List.of("Alpha","Bravo","Charlie","Delta"));
		for(String s: list) {
			System.out.println(s);
		}
		
		System.out.println("-------------");
		list.replaceAll(s->s.charAt(0)+ " - " + s.toUpperCase());
		list.forEach(s->System.out.println(s));
		System.out.println("-------------");
		
		String[] emptyStrings=new String[10];
		System.out.println(Arrays.toString(emptyStrings));
		System.out.println("-------------");
		Arrays.setAll(emptyStrings, i->""+(i+1)+".");
		System.out.println(Arrays.toString(emptyStrings));
		
		System.out.println("-------------");
		Arrays.setAll(emptyStrings, i->""+(i+1)+"."
				+switch(i) {
				case 0->"one";
				case 1->"two";
				case 2->"three";
				default->"";
				});
		System.out.println(Arrays.toString(emptyStrings));
		System.out.println("-------------");
		
		String[] names= {"David","Don","Champ","Nathan"};
		String[] randomList=randomlySelectedValues(15,names,()->new Random().nextInt(0,names.length));
		System.out.println(Arrays.toString(randomList));

	}
	
	public static String[] randomlySelectedValues(int count, String[] values,Supplier<Integer>s) {
		String[] selectedValues=new String[count];
		for(int i=0;i<count;i++) {
			selectedValues[i]=values[s.get()];
		}
		
		return selectedValues;
	}

}
