package practice.java.basics;

public class EvenDigitSum {
	
	public static int getEvenDigitSum(int number) {
		if(number<0) {
			return -1;
		}
		else {
			int sum=0;
			while(number>0) {
				if((number%10)%2==0) {
					sum+=number%10;
				}
				number=number/10;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456));

	}

}
