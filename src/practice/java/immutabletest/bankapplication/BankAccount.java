package practice.java.immutabletest.bankapplication;

import java.util.LinkedHashMap;
import java.util.Map;

public class BankAccount {
	
	public enum AccountType {CHEQUING,SAVING};
	
	private final AccountType accountType;
	private  double balance;
	private final Map<Long,Transaction> transactions=new LinkedHashMap<>();
	
	

	public BankAccount(AccountType accountType, double balance) {
		this.accountType = accountType;
		this.balance=balance;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}
	
	public Map<Long, String> getTransactions() {
		Map<Long,String> txMap=new LinkedHashMap<>();
		for(var tx : transactions.entrySet()) {
			txMap.put(tx.getKey(), tx.getValue().toString());
		}
		return txMap;
	}

	@Override
	public String toString() {
		return "%s $%.2f".formatted(accountType,balance);
	}
	
	void commitTransactions(int routingNumber,String customerId,long transactionId,double amount) {
		balance+=amount;
		transactions.put(transactionId, new Transaction(routingNumber, Integer.parseInt(customerId),transactionId,amount));
		
		
	}

	

}
