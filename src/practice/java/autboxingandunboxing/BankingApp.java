package practice.java.autboxingandunboxing;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

	public static void main(String[] args) {
		Customer jane=new Customer("Jane",500);
		System.out.println(jane);
		Bank bank=new Bank("HSBC");
		bank.addCustomer("Matt", 1000.00);
		bank.printStatement("Matt");


	}

}
