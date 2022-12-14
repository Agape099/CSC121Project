public class Account {

	//instance members

	private boolean closeAcc;
	private double accBalance;
	private int accountNumber;
	private String accountName;
	private Customer customer;
	private static int counter = 2323;

	// constructors

	protected Account() {
		closeAcc = false;
		accBalance = 0;
		accountNumber = counter;
		counter++;
	}

	public Account(Customer c,String acctName) {
		this.customer=c;
		this.accountName=acctName;
		closeAcc=false;
		accBalance=0;
		accountNumber = counter;

		counter++;
	}

	//Program deposits said amount

	public void deposit(double amount) {
		if (amount > 0 && !closeAcc) {
			accBalance += amount;
			System.out.println("Deposit successful, the new balance is: " + accBalance);
		}

		else {
			System.out.println("Deposit failed, the balance is: " + accBalance);
		}

	}


	//Program withdraws said amount

	public void withdraw(double amount) {
		if(accBalance==0){
			System.out.println("Withdraw failed, the balance is: " + accBalance);

		}
		
		else if (accBalance - amount >= 0 && amount >= 0) {
			accBalance -= amount;
			System.out.println("Withdraw successful, the new balance is: " + accBalance);
		}
		
		else if (amount > accBalance) {
			System.out.println("\nWithdraw failed, you cannot withdraw an amount greater than your current balance. The balance is: " + accBalance);
		}

	}

	//setters and getters

	public boolean closeAcc() {
		return closeAcc;
	}
	public void setClosed(boolean closed) {
		closeAcc = closed;
	}


	//get balance information
	public double getBalance() {
		return accBalance;
	}
	//set balance information
	public void setBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	//get account number
	public int getAccountNumber() {
		return accountNumber;
	}
	//set account number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	//get account name
	public String getAccountName() {
		return accountName;
	}
	//set account name
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	//get customer information
	public Customer getCustomer() {
		return customer;
	}
	//set customer information
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	//return the string representation of the Account

	

	public String toString() {

		return String.format("%d(%s) : %s : %s : %s : %.1f : %s", accountNumber, accountName, customer.getFirstName(), customer.getLastName(), customer.getSocialSecurityNumber(), accBalance, (closeAcc == false ? "Account Open" : "Account Closed"));

	}

}