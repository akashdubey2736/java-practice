package practice.java.basics;

public class TeenNumberChecker {
	
	public static boolean hasTeen(int num1, int num2, int num3) {
		if((num1>=13 && num1<=19)|| (num2>=13 && num2<=19) || (num3>=13 && num3<=19)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(hasTeen(25,22,20));
		

	}

}
