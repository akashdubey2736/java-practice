package practice.java.nestedclasses.staticnested;

import java.util.Comparator;

public class Employee {
	
	public static class EmployeeComparator <T extends Employee> implements Comparator<Employee>{
		
		private String sortType;
		
		public EmployeeComparator() {
			this("name");
			
		}
		
		public EmployeeComparator(String sortType) {
			this.sortType=sortType;
			
		}
		public int compare(Employee o1, Employee o2) {
			if(sortType.equalsIgnoreCase("yearStarted")) {
				return o1.yearStarted-o2.yearStarted;
			}
			else {
				return o1.name.compareTo(o2.name);
				
			}
			
		}
		
	}
	
	private int employeeId;
	private String name;
	private int yearStarted;
	

	public Employee() {
		
	}
	
	public Employee(int employeeId, String name, int yearStarted) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.yearStarted = yearStarted;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public int getYearStarted() {
		return yearStarted;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", yearStarted=" + yearStarted + "]";
	}

	

	

}
