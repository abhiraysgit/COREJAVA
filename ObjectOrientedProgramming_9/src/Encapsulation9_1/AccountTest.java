package Encapsulation9_1;

public class AccountTest {
	public static void main(String[] args) {
		Account Raja = new Account();
		Account vijay = new Account();
		Raja.setNumber("982110510000715");
		Raja.setAccountType("Saving");
		Raja.setBalance(10000);
		vijay.setBalance(10000);

		double amountTobetransferred = 5000;
		double amounttobetansferred = 7000;
		vijay.funtransferred(amountTobetransferred, Raja, vijay);

		String c = "Account details .........";
		System.out.println(c);
		System.out.println("Customor Account number......" + Raja.getNumber());
		System.out.println("Customer Account Type......." + Raja.getAccountType());
		System.out.println("Customer Raja Account balance........" + Raja.getBalance());
		Raja.deposit(700);

		System.out.println("Remaining Raja balance...... " + Raja.getBalance());
		Raja.withdrowl(500);
		System.out.println("Remaining Raja balance....... " + Raja.getBalance());
		System.out.println("Raja Account balance" + Raja.getBalance());
		System.out.println("vijay Account balance" + vijay.getBalance());
	}
}