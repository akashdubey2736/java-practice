package practice.java.oop.classandinheritence;

public class BankAccount {
	
	private int accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private long phoneNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFund(double amount) {
		this.accountBalance+=amount;
	}
	
	public boolean withdrawFund(double amount) {
		if (this.accountBalance>amount){
			this.accountBalance-=amount;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
