package encapsulation;

/**
 * It is a mechanism of wrapping variable and methods in a unit , where class
 * represents the unit.
 * 
 * @author adity
 *
 */
public class Bank {
	private String bankName = "SBI";
	private long accNo = 4567;
	private long balance = 60007000;
	private long withdraw;
	private int age;
	private String city;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getWithdraw() {

		return withdraw;
	}

	public void setWithdraw(long withdraw) {
		if (withdraw <= 5000) {
			balance = balance - withdraw;
			System.out.println("You can collect your cash.");
		} else {
			System.out.println("Maximun withdraw limit is 5000 only");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
