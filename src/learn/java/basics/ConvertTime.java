package learn.java.basics;

public class ConvertTime {
	
	public static String getDurationString(int seconds) {
		int minutes=seconds/60;
		int hours=minutes/60;
		int remainingMinutes=minutes%60;
		int remainingSeconds=seconds%60;
		
		return hours+"h "+remainingMinutes+" m "+remainingSeconds+"s";
		
	}
	
	public static String getDurationString(int minutes,int seconds) {
		int totalSeconds=minutes*60+seconds;
		return getDurationString(totalSeconds);
		
	}


	public static void main(String[] args) {
		System.out.println((getDurationString(10000)));
		System.out.println(getDurationString(2000,4000));
		
	}

}
