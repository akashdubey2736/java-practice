package practice.java.nestedclasses.local;

import java.util.ArrayList;
import java.util.List;

import practice.java.nestedclasses.inner.StoreEmployee;
import practice.java.nestedclasses.staticnested.Employee;

public class Localnested {
	
	public static void addPigLatinName(List<? extends StoreEmployee> list) {
		class DecoratedEmployee extends StoreEmployee{
			private String pigLatinName;
			private Employee orginalInstance;
		
			public DecoratedEmployee(String pigLatinName, Employee orginalInstance) {
				super();
				this.pigLatinName = pigLatinName;
				this.orginalInstance = orginalInstance;
			}
		
			public String toString() {
			return orginalInstance.toString()+" "+ pigLatinName;
			
			}
		}
		
		List<DecoratedEmployee> newList=new ArrayList<>(list.size());
		
		for(var employee : list) {
			String name=employee.getName();
			String pigLatin=name.substring(1)+name.charAt(0)+"ay";
			newList.add(new DecoratedEmployee(pigLatin,employee));
		}
		
		for(var dEmployee: newList) {
			System.out.println(dEmployee);
		}
	}

	public static void main(String[] args) {
		List<StoreEmployee> storeEmployees=new ArrayList<>(List.of(
				new StoreEmployee(10001,"Ralph",2020,"Target"),
				new StoreEmployee(10002,"David",2021,"Costco"),
				new StoreEmployee(10003,"Kevin",2022,"Target"),
				new StoreEmployee(10004,"Frank",2023,"Wallmart"),
				new StoreEmployee(10005,"Jason",2024,"Adonis")));
		addPigLatinName(storeEmployees);
		

	}

}
