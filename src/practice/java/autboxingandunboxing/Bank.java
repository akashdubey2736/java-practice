package practice.java.autboxingandunboxing;

import java.util.ArrayList;

record Customer(String name,ArrayList<Double> transactions){
	
	public Customer(String name,double intialDeposit) {
		this(name.toUpperCase(),new ArrayList<Double>(500));
		transactions.add(intialDeposit);
	}
	
	
}

public class Bank {
	
	private String name;
	private ArrayList<Customer> customers=new ArrayList<>(5000);
	
	public Bank(String name) {
		this.name=name;
	}
	
	private Customer getCustomer(String customerName) {
		for(var customer : customers) {
			if(customer.name().equalsIgnoreCase(customerName)){
				return customer;
			}
		}
		System.out.println("Customer with name - "+customerName+" not found!");
		return null;
	}
	
	public int  addCustomer( String customerName, double initalDeposit) {
		
		if(getCustomer(customerName)==null) {
			customers.add(new Customer(customerName,initalDeposit));
			System.out.println("Customer with name - "+customerName+" was added!");
			return 0;
			
		}
		else {
			return -1;
			
		}
	}
	
	public void printStatement(String customerName) {
		int numOfTransaction=0;
		Customer customer=getCustomer(customerName);
		if(customer!=null) {
		System.out.println("Customer Name : "+customer.name());
		System.out.println("Transactions:");
		for(Double transaction: customer.transactions()) {
			numOfTransaction+=1;
			System.out.printf(numOfTransaction+". $%10.2f (%s)%n",transaction,transaction<0?"Debit":"Credit");
		}
		}
		else {
			System.out.println("Customer with name - "+customerName+" not found!");
			
		}
	}
		
		public void addTransactions(String name, double transactionAmount) {
			Customer customer=getCustomer(name);
			if(customer!=null) {
				customer.transactions().add(transactionAmount);
			}
		}
	

}
