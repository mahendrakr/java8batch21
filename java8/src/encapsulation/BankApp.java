package encapsulation;

public class BankApp {

	public static void main(String[] args) {
		Bank b = new Bank();
//		System.out.println(b.getBalance());
		 b.setWithdraw(5000);
		 System.out.println(b.getBalance());
	}

}