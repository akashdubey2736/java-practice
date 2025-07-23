package practice.java.oop.classandinheritence;

public class Employee extends Worker{
	
	private long employeeId;
	private String hireDate;
	
	public static int employeeNo;
	
	public Employee( String name, String birthDate,String hireDate) {
		super(name,birthDate);
		this.employeeId=Employee.employeeNo++;
		this.hireDate=hireDate;
		}
	
	public String toString() {
		return "Employee{"+" employeeId= "+employeeId+" hireDate= "+hireDate+"}"+super.toString();
	}

}
