public class Account {
	 private String accName;
	 private String acid;
	 private int balance;

	Account() {}

	Account(String accName, String acid, int balance) {
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}

	public void deposit(int amount)  {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	public void transfer(int amount, Account receiver) {
		receiver.deposit(amount);
		this.withdraw(amount);
	}

	public static void main(String args[]) {
		Account Bean = new Account("Bean", "1", 500);
		Account Charlie = new Account("Kingsman", "2", 200);
		Bean.deposit(10);
		Bean.withdraw(50);
		Charlie.deposit(30);
		Charlie.withdraw(30);
		Bean.transfer(25, King);
	}
}
