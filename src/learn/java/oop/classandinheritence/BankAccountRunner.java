package learn.java.oop.classandinheritence;

public class BankAccountRunner {

	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		bankAccount.setAccountNumber(10001);
		bankAccount.setCustomerName("David");
		bankAccount.setEmail("david@gmail.com");
		bankAccount.setPhoneNumber(514);
		bankAccount.setAccountBalance(1000.00);
		
		bankAccount.depositFund(200.00);
		System.out.println("New Balance is : "+bankAccount.getAccountBalance());
		
		if(bankAccount.withdrawFund(5000)) {
			System.out.println("New Balance is : "+bankAccount.getAccountBalance());
			}
		else {
			System.out.println("Not enough balance to withdraw!!");
		}
		

	}
}
