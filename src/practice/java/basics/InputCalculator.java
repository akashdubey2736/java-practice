package practice.java.basics;

import java.util.Scanner;

public class InputCalculator {
	
	public static void inputthenPrintSumAndAverage() {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int totalInputCount=0;
		float average=0;
		
		while(scanner.hasNextInt()) {
			sum=sum+scanner.nextInt();
			totalInputCount+=1;
			
		}
		average=sum/totalInputCount;
		
		System.out.println("SUM = "+sum+" AVG = "+average);
	}

	public static void main(String[] args) {
		inputthenPrintSumAndAverage();

	}

}
