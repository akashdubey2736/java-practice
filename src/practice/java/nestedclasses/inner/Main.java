package practice.java.nestedclasses.inner;

import java.util.ArrayList;
import java.util.List;

import practice.java.nestedclasses.staticnested.Employee;

public class Main {

	public static void main(String[] args) {

		List<StoreEmployee> storeEmployees=new ArrayList<>(List.of(
				new StoreEmployee(10001,"Ralph",2020,"Target"),
				new StoreEmployee(10002,"David",2021,"Costco"),
				new StoreEmployee(10003,"Kevin",2022,"Target"),
				new StoreEmployee(10004,"Frank",2023,"Wallmart"),
				new StoreEmployee(10005,"Jason",2024,"Adonis")));
		
		var genericEmployee=new StoreEmployee();
		var comparator= genericEmployee.new StoreComparator<StoreEmployee>();
		
		storeEmployees.sort(comparator);
		
		for(StoreEmployee e : storeEmployees) {
			System.out.println(e);
		}

	}

}
