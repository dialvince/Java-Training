package oop;

public class BankAccount implements IRate {
	
	//define variables
	String accountnumber;
	private static final String routingnumber = "0123456";
	private String name;
	private String snn;
	String accounttype;
	double balance = 0;
	
	BankAccount() {
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit of: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Mimimum Deposit must be at least $1000";
		}else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
			System.out.println(Msg);
			balance = initDeposit;
		}
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	public String getName() {
		return "Mr. " + name;
	}
	
	public String getSnn() {
		return snn;
	}
	public void setSnn(String snn) {
		this.snn = snn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	

	//define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your recent transaction " + activity);
		System.out.println("Your new balance is: $" + balance);
		
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + ", ACCOUNTS " + accountnumber + ", ROUTING #" + routingnumber + ", BALANCE: $" + balance + "]";
	}
}
