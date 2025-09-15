package practice.java.immutabletest.bankapplication;

public class Transaction {
	
	private int routingNumber;
	private int customerId;
	private long transactionId;
	private double amount;
	
	public Transaction(int routingNumber, int customerId, long transactionId, double transactionAmount) {
		super();
		this.routingNumber = routingNumber;
		this.customerId = customerId;
		this.transactionId = transactionId;
		this.amount = transactionAmount;
	}
	
	public int getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public double getTransactionAmount() {
		return amount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.amount = transactionAmount;
	}
	
	public String toString() {
		return "%015d:%020d:%015d:%012.2f".formatted(routingNumber,customerId,transactionId,amount);
	}
	

}
