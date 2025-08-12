package practice.java.lambdaexpressions.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaIntro {
	
	record Person(String firstName,String lastName){
		
		public String toString() {
			return "First Name : "+firstName+" Last Name: "+lastName;
			
		}
	}
	
	public static void main(String[] args) {
		
		List<Person> people=new ArrayList<>(Arrays.asList(new Person("David", "Guetta"),
				new Person("Mark","Antony"),
				new Person("Jenifer","Lopez"),
				new Person("Taylor","Swift")));
		
		//using anonymous class
		var comparatorLastName=new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.lastName.compareTo(o2.lastName);
			}
			
		
	};
	
		people.sort(comparatorLastName);
		for(var person : people) {
			System.out.println(person);
		}
		
		
		//using lambda expression
		people.sort((o1,o2)->o1.lastName().compareTo(o2.lastName()));
		System.out.println(people);
	
	}

}
