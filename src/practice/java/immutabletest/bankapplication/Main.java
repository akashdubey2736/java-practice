package practice.java.immutabletest.bankapplication;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Bank bank= new Bank(3214567);
		bank.addCustomer("Joe",500.00,10000.00);
		BankCustomer joe=bank.getCustomer("000000010000000");
		System.out.println(joe);
		
		System.out.println("----------------------------------------");
		if(bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHEQUING, 35)) {
			System.out.println(joe);
		}
		
		if(bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHEQUING, -535.00)) {
			System.out.println(joe);
		}
		
		BankAccount chequing= joe.getAccount(BankAccount.AccountType.CHEQUING);
		var tarnsactions=chequing.getTransactions();
		tarnsactions.forEach((k,v)->System.out.println(k + " " + v));

	}

}
