package practice.java.nestedclasses.inner;

import java.util.Comparator;

import practice.java.nestedclasses.staticnested.Employee;

public class StoreEmployee extends Employee{
	
	private String store;
	public StoreEmployee() {
		
	}
	
	public StoreEmployee(int employeeId,String employeeName,int yearStarted,String store) {
		super(employeeId,employeeName,yearStarted);
		this.store=store;
	}
	

	@Override
	public String toString() {
		return "StoreEmployee [store=" + store + ", Name=" + getName() + ", Employee id=" +super.getEmployeeId() +
				", yearStarted="+super.getYearStarted()+"]";
	}

	public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee>{

		@Override
		public int compare(StoreEmployee o1, StoreEmployee o2) {
			int result=o1.store.compareTo(o2.store);
			return result;
		}
		
	}

}
