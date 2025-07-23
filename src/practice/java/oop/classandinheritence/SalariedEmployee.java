package practice.java.oop.classandinheritence;

public class SalariedEmployee extends Employee {
	
	private double annualSalary;
	private boolean isRetired=false;
	
	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary=annualSalary;
	}

	public void retire() {
		terminate("12/11/2024");
		this.isRetired=true;
		
	}
	
	public double collectPay() {
		double payCheck=annualSalary/26;
		double adjustedPay =(isRetired)?0.9*payCheck:payCheck;
		return (int)(adjustedPay);
	}

}
