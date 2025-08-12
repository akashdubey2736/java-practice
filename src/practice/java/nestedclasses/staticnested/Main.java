package practice.java.nestedclasses.staticnested;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>(List.of(
				new Employee(10001,"Ralph",2020),
				new Employee(10002,"David",2021),
				new Employee(10003,"Kevin",2022),
				new Employee(10004,"Frank",2023),
				new Employee(10005,"Jason",2024)));
		
		employees.sort(new Employee.EmployeeComparator<>());
		for(Employee e : employees) {
			System.out.println(e);
		}
	}

}
