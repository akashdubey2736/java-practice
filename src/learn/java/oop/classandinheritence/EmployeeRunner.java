package learn.java.oop.classandinheritence;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee emp1= new Employee("David","11/11/2000","01/01/2020");
		System.out.println(emp1);
		System.out.println("Age= "+emp1.getAge());
		System.out.println("Pay= "+emp1.collectPay());
		
		SalariedEmployee emp2=new SalariedEmployee("Mike","11/11/1991","01/01/2022",35000);
		System.out.println(emp2);
		System.out.println("Regular salary= "+emp2.collectPay());
		emp2.retire();
		System.out.println("Pension salary= "+emp2.collectPay());
		
		HourlyEmployee emp3=new HourlyEmployee("Mary","11/11/1990","01/01/2019",35000);
		System.out.println(emp3);
		System.out.println("Regular salary= "+emp3.collectPay());
		System.out.println("Pension salary= "+emp3.getDoublePay());
		
		
		}

}
