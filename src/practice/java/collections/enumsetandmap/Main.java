package practice.java.collections.enumsetandmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	public static void main(String[] args) {
		List<WeekDay> annsWorkDay=new ArrayList<>(List.of(WeekDay.MONDAY,WeekDay.TUESDAY,
				WeekDay.THURSDAY,WeekDay.FRIDAY));
		var annsDaySet= EnumSet.copyOf(annsWorkDay);
		System.out.println(annsDaySet.getClass().getSimpleName());
		annsDaySet.forEach(System.out::println);
		
		System.out.println("---------------------");
		
		var allDaySet=EnumSet.allOf(WeekDay.class);
		allDaySet.forEach(System.out::println);
		
		System.out.println("---------------------");
		Set<WeekDay> newPersonDays=EnumSet.complementOf(annsDaySet);
		newPersonDays.forEach(System.out::println);
		
		System.out.println("---------------------");
		Set<WeekDay> anotherWay=EnumSet.copyOf(allDaySet);
		anotherWay.removeAll(annsWorkDay);
		anotherWay.forEach(System.out::println);
		
		
		Map<WeekDay, String[]> employeeMap=new EnumMap<>(WeekDay.class);
		employeeMap.put(WeekDay.FRIDAY,new String[] {"Ann","Marry","Bob"});
		employeeMap.put(WeekDay.MONDAY,new String[] {"Marry","Bob"});
		employeeMap.forEach((k,v) -> System.out.println(k + " : "+Arrays.toString(v)));
		
		
		
		

	}

}
