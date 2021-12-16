package Encapsulation9_1;
public class Account {
	private String number;
	private String accountType;
	private double balance;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double d) {
		// TODO Auto-generated method stub
		balance = balance + d;
		System.out.println("Customer balance deposite ......" + d);
	}

	public void withdrowl(double w) {
		// TODO Auto-generated method stub
		balance = balance - w;
		System.out.println("Customer balance withdrowl...." + w);
	}

	public void funtransferred(double amountTobetransferred, Account Raja, Account vijay) {
		Raja.setBalance(Raja.getBalance() - amountTobetransferred);
		vijay.setBalance(vijay.getBalance() + amountTobetransferred);
	}
	public void payBill() {
		
	}

}