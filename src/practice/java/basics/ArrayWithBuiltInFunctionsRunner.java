package practice.java.basics;

import java.util.Arrays;
import java.util.Random;

public class ArrayWithBuiltInFunctionsRunner {

	public static void main(String[] args) {
		
		int[] firstArray=getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));
		
		int[] secondArray=new int[10];
		Arrays.fill(secondArray, 5);
		System.out.println(Arrays.toString(secondArray));
		
		int[] thirdArray=Arrays.copyOf(firstArray,firstArray.length );
		System.out.println(Arrays.toString(thirdArray));
		
		String[] sArray= {"Able","Jane","Mark","Ralph","David"};
		Arrays.sort(sArray);
		System.out.println(Arrays.toString(sArray));
		if(Arrays.binarySearch(sArray, "Mark")>=0) {
			System.out.println("Found Mark in the list");
		}
		
		int[] s1= {1,2,3,4,5};
		int[] s2= {1,2,3,4,5};
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("Arrays are equal!");
		}
		else {
			System.out.println("Arrays are not equal!");
		}
		
		
		int[] testArray= getRandomArray(5);
		
		System.out.println("Created Arrays is :"+Arrays.toString(testArray));
		
		System.out.println("Sorted Arrays is :"+Arrays.toString(sortArray(testArray)));

	}
	
	
	private static int[] getRandomArray(int len) {
		Random random=new Random();
		int[] newInt=new int[len];
		
		for(int i=0; i<len;i++) {
			newInt[i]=random.nextInt(100);
		}
		return newInt;
		
	}
	
	private static int[] sortArray(int[] array) {
		int[] sortedArray=Arrays.copyOf(array, array.length);
		int temp;
		boolean flag=true;
		while(flag) {
			flag=false;
		for(int i=0;i<sortedArray.length - 1;i++) {
			if(sortedArray[i]<sortedArray[i + 1]) {
				temp=sortedArray[i];
				sortedArray[i]=sortedArray[i + 1];
				sortedArray[i + 1 ]=temp;
				flag=true;
				}
			}
		}
		return  sortedArray;
		
	}

}
