package learn.java.basics;

public class MegaBytesConvertor {
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes<0)
		{
			System.out.println("Invalid value!!");
		}
		else {
			int megaBytes=kiloBytes/1024;
			int kb=kiloBytes%1024;
			
			System.out.println(kiloBytes+" KB="+megaBytes+" MB and "+kb+"KB");
			
		}
		
		
	}

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);

	}

}
