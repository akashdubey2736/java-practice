package practice.java.oop.classandinheritence;

public class Customer {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	public Customer(String name,double creditLimit,String emailAddress) {
		this.name=name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAddress;
		
	}
	
	public Customer() {
		this("David",10000.00,"david@gmail.com");
		
	}
	
	
	public Customer(String name, String emailAddress) {
		this(name,0.00,emailAddress);
	}

}
