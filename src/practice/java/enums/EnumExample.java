package practice.java.enums;

import java.util.Random;

public class EnumExample {

	public static void main(String[] args) {
		DayOfTheWeek weekDay=DayOfTheWeek.FRI;
		System.out.println(weekDay);
		System.out.println(weekDay.name());
		System.out.println(weekDay.ordinal());
		
		for(int i=0;i<10;i++) {
			weekDay=getRandomDay();
			System.out.printf("Name is %s, Ordinal value = %d%n",weekDay.name(),weekDay.ordinal());
			
			
			if(weekDay==DayOfTheWeek.FRI) {
				System.out.println("Found Friday!!");
			}
		}
		
		switchDayOfTheWeek(weekDay);
		
		for (Topping topping:Topping.values()){
			System.out.println(topping.name()+ " : "+topping.getPrice());
			
		}
		
		

	}
	
	public static DayOfTheWeek getRandomDay() {
		int randomInteger=new Random().nextInt(7);
		var allDays=DayOfTheWeek.values();
		return allDays[randomInteger];
	}
	
	public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
		int weekDayInteger=weekDay.ordinal()+1;
		switch(weekDay) {
		case WED->System.out.println("Wedensday is the Day "+weekDayInteger);
		case THURS->System.out.println("Thursday is the Day "+weekDayInteger);
		case FRI->System.out.println("Friday is the Day "+weekDayInteger);
		case SAT->System.out.println("Saturday is the Day "+weekDayInteger);
		case SUN->System.out.println("Sunday is the Day "+weekDayInteger);
		case MON->System.out.println("Monday is the Day "+weekDayInteger);
		case TUES->System.out.println("Tuesday is the Day "+weekDayInteger);
		default->System.out.println(weekDay.name().charAt(0)+weekDay.name().substring(1).toLowerCase()
				+"day is day "+weekDayInteger);
		
		
		}
		
	}

}
