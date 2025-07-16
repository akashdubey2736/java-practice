package learn.java.oop.classandinheritence;

public class CustomerRunner {

	public static void main(String[] args) {
		//Customer cust1=new Customer();
		//Customer cust1=new Customer("John",1500.00,"john@gmail.com");
		Customer cust1=new Customer("Maxim","maxim@gmail.com");
		
		System.out.println("Name : "+cust1.getName()+" Credit Limit : "+cust1.getCreditLimit()
		+" Email Id : "+cust1.getEmailAddress());
		

	}

}
