package practice.java.oop.abstractionandinterfaces.mappableandgeojason;

import java.util.ArrayList;
import java.util.List;

public class MappableRunner {

	public static void main(String[] args) {
		
		List<Mappable> mappables=new ArrayList<>();
		mappables.add(new Building("Chateau Fairmont",UsageType.RESIDENTIAL));
		mappables.add(new Building("Assembly Quebec",UsageType.GOVERNMENT));
		mappables.add(new UtilityLine("College St.",UtilityType.ELECTRICAL));
		mappables.add(new UtilityLine("Boulevard",UtilityType.GAS));
		
		for(var m : mappables) {
			Mappable.printProperties(m);
		}

	}

}
