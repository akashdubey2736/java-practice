package practice.java.collections.sets.phoneandemail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
	
	private static final String phoneData="""
			Jenni,2341234568
			Carlos,2347890123
			Max,4509053467
			Jenni,2341234568
			Rob,3459087645
			""";
	
private static final String emailData="""
		Jenni,Jenni123@gmail.com
		Jenni, Jenni234@gmail.com
		Max, Max@gmail.com
		Rob, Rob@gmail.com
		Carlos, Carlos@gmail.com
		""";

	public static List<Contact> getData(String type){
		
		List<Contact> dataList=new ArrayList<>();
		Scanner scanner=new Scanner(type.equals("phone")?phoneData:emailData);
		while(scanner.hasNext()) {
			String[] data=scanner.nextLine().split(",");
			Arrays.asList(data).replaceAll(String::trim);
			if(type.equals("phone")) {
				dataList.add(new Contact(data[0],Long.parseLong(data[1])));
			}
			if(type.equals("email")) {
				dataList.add(new Contact(data[0],data[1]));
			}
		}
		
		return dataList;
		
	}

}
