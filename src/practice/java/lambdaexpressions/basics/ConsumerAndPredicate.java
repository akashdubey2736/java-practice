package practice.java.lambdaexpressions.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ConsumerAndPredicate {

	public static void main(String[] args) {
		var coords=Arrays.asList(new double[] {47.21,-31.28},
				new double[] {32.21,-28.45},
				new double[] {3.21,-4.82},
				new double[] {1.28,-90.32});
				
		
		coords.forEach(s->System.out.println(Arrays.toString(s)));
		
		BiConsumer<Double,Double>p1=(lat,lng)->System.out.printf("[lat:%.3f lon:%.3f]%n",lat,lng);
		
		var firstPoint=coords.get(0);
		processPoint(firstPoint[0],firstPoint[1],p1);
		
		System.out.println("------------");
		coords.forEach(s->processPoint(s[0],s[1],p1));
		
		System.out.println("------------");
		
		List<String> list=new ArrayList<>(List.of("echo","easy","earnest"));
		list.forEach(s->System.out.println(s));
		System.out.println("------------");
		list.removeIf(s->s.startsWith("ea"));
		list.forEach(s->System.out.println(s));
	}
	
	public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
		consumer.accept(t1,t2);
	}
	
	

}
