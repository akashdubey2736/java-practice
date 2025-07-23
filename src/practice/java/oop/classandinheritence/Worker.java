package practice.java.oop.classandinheritence;

public class Worker {

	private String name;
	protected String endDate;
	private String birthDate;
	
	public Worker() {
		
	}
	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	
	
	public int getAge() {
		int currentYear=2025;
		int birthYear=  Integer.parseInt(birthDate.substring(6));
		return currentYear-birthYear;
		
	}
	
	public double collectPay() {
		return 0.0;
	}
	
	public void terminate(String endDate) {
		this.endDate=endDate;
	}
	
	public String toString() {
		return "Worker{" +"name= "+name+ " birthDate= "+birthDate+" endDate="+endDate+"}";
	
	}
	
	

}
