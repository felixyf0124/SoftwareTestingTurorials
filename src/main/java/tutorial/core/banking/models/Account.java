package tutorial.core.banking.models;

public class Account {

	private String accountNumber;
	private double balance;
	private boolean isBlocked=false;
	private double maxAllowedBalance;
	private AccountType accountType;
	
	public Account(String accountNumber,double balance,boolean isBlocked,AccountType accountType) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.isBlocked=isBlocked;
		this.accountType=accountType;
		this.maxAllowedBalance=Double.MAX_VALUE;
	}
	
	public Account(String accountNumber,double balance,boolean isBlocked,AccountType accountType,double maxAllowedBalance){
		
		this(accountNumber,balance,isBlocked,accountType);
		this.maxAllowedBalance=maxAllowedBalance;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance=balance;
	}

	public void setIsBlocked(boolean isBlocked) {
		this.isBlocked=isBlocked;
	}
	
	public boolean getIsBlocked() {
		return this.isBlocked;
	}
	
	public void setType(AccountType accountType) {
		this.accountType=accountType;
	}
	
	public AccountType getType() {
		return this.accountType;
	}
	 
	public double getMaxAllowedBalance() {
		return this.maxAllowedBalance;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

}
