package learn.java.basics;

import java.util.Arrays;

public class ArrayRunner {

	public static void main(String[] args) {
		

		int[] myIntArray=new int[10];
		myIntArray[5]=50;
		
		double[] myDoubleArray=new double[10];
		myDoubleArray[2]=3.5;
		
		int[] firstTen={1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("myIntArray[0] "+myIntArray[0]);
		System.out.println("myIntArray Length : "+myIntArray.length);
		System.out.println("myIntArray  : "+Arrays.toString(myIntArray));
		System.out.println("myDoubleArray[0] : "+myDoubleArray[0]);
		System.out.println("myDoubleArray Length : "+myDoubleArray.length);
		System.out.println("myDoubleArray  : "+Arrays.toString(myDoubleArray));
		System.out.println("firstTen[0] "+myIntArray[0]);
		System.out.println("firstTen Length : "+myIntArray.length);
		System.out.println("firstTen  : "+Arrays.toString(firstTen));


	}

}
