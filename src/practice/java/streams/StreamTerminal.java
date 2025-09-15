package practice.java.streams;

import java.util.stream.IntStream;

public class StreamTerminal {

	public static void main(String[] args) {
		
		var result= IntStream.iterate(0, i -> i<=1000, i -> i = i + 10)
				.summaryStatistics();
		System.out.println(result);
		
		var leapYearData= IntStream
				.iterate(2000, i -> i <=2025, i -> i = i + 1)
				.filter(i-> i % 4 == 0)
				.peek(System.out::println)
				.summaryStatistics();
		
		System.out.println("Leap year Data : "+leapYearData);
		
		

	}

}
