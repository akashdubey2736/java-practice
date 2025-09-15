package practice.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic {
	
	public static void main(String[]  args) {
		
		List<String> bingoPool= new ArrayList<>(75);
		int start=1;
		for(char c :  "BINGO".toCharArray()) {
			for(int i=start;i<(start+15);i++) {
				bingoPool.add(""+c + i);
			}
			start+=15;
		}
		Collections.shuffle(bingoPool);
		for(int i=0;i<15;i++ ) {
			System.out.println(bingoPool.get(i));
		}
		
		System.out.println("------------------------------------------");
		//List<String> firstOnes=bingoPool.subList(0, 15);
		List<String> firstOnes=new ArrayList<>(bingoPool.subList(0, 15));
		firstOnes.sort(Comparator.naturalOrder());
		firstOnes.replaceAll(s->{
			if(s.indexOf('G')==0 || s.indexOf("O")==0) {
				String updated=s.charAt(0)+ "-" +s.substring(1);
				System.out.print(updated + " ");
				return updated;
			}
			return s;
		});
		System.out.println("\n-----------------------------------------");
		
		for(int i=0;i<15;i++ ) {
			System.out.println(bingoPool.get(i));
		}
		
		System.out.println("------------------------------------------");
		
		bingoPool.stream()
			.limit(15)
			.filter(s->s.indexOf('G')==0 || s.indexOf("O")==0)
			.map(s->s.charAt(0) + "-"+s.substring(1))
			.sorted()
			.forEach(s->System.out.print(s+" "));
		
		
		System.out.println("\n-----------------------------------------");
		
		String[] strings= {"One","Two","Three"};
		
		var firstStream=Arrays.stream(strings)
			.sorted(Comparator.reverseOrder());
			//.forEach(System.out::println );
		
		var secondStream=Stream.of("Six","Five","Four")
			.map(String :: toUpperCase);
		//	.forEach(System.out::println);
		
		System.out.println("\n-----------------------------------------");
		
		Stream.concat(firstStream, secondStream)
			.map(s->s.charAt(0)+"-"+s)
			.forEach(System.out::println);
		
		Random random=new Random();
		Stream.generate(()->random.nextInt(2))
		.limit(10)
		.forEach(System.out::println);
		
		System.out.println("\n-----------------------------------------");
		
		IntStream.iterate(1, n -> n + 1)
			.filter(n->n%2==0)
			.limit(20)
			.forEach(System.out::println);
		
		System.out.println("\n-----------------------------------------");
		
		IntStream.range(1, 100)
			.limit(20)
			.forEach(System.out::println);
	
	}

}
