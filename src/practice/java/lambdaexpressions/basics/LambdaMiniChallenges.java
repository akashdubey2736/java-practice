package practice.java.lambdaexpressions.basics;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaMiniChallenges {

	public static void main(String[] args) {
		
		Consumer<String> printWordsLambda=sentence->{
			String[] parts=sentence.split(" ");
			for(String part : parts) {
				System.out.println(part);
			}
			
		};
		
		printWordsLambda.accept("Let's split this up into an Array");
		
		System.out.println("-----------------");
		
		Consumer<String> printWordsForEach=sentence->{
			String[] parts=sentence.split(" ");
			Arrays.asList(parts).forEach(s->System.out.println(s));
			
		};
		
		
		printWordsForEach.accept("Let's split this up into an Array");
		
		System.out.println("-----------------");
		
		Consumer<String> printWordsConcise=sentence->{Arrays.asList(sentence.split(" ")).
				forEach(s->System.out.println(s));
			
		};
		
		
		printWordsConcise.accept("Let's split this up into an Array");
		
		System.out.println("-----------------");
		
		Function<String,String> everySecondChar=source->{
			StringBuilder returnVal=new StringBuilder();
			for(int i=0;i<source.length();i++) {
				if(i%2==0) {
					returnVal.append(source.charAt(i));
				}
			}
			return returnVal.toString();
			
		};
		
		System.out.println(everySecondChar.apply("1234567890"));
		
		System.out.println("-----------------");
		
		System.out.println(everySecondCharacter(everySecondChar,"1234567890"));
		
		System.out.println("-----------------");
		
		Supplier<String> iLoveJava=()->"I Love Java!";
		System.out.println(iLoveJava.get());

	}
	
	
	public static String everySecondCharacter(Function<String,String> func, String source) {
		return func.apply(source);
	}
	
	
}
