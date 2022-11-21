public class Account {
	private	String accName;
	private String acid;
	private int balance;
	private Transaction [] listOfTransaction = new Transaction[1000];
	private  int totalNumberOfTransaction;

	Account() {}

	Account(String accName, String acid, int balance) {
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}

	public String getAccountName() {
		return this.accName;
	}

	public String getAccountId() {
		return this.acid;
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
		this.addTransaction(this, receiver, amount);
	}

	public void addTransaction(Account sender, Account receiver, int amount) {
		Transaction newTransaction = new Transaction(sender, receiver, amount);
		listOfTransaction[totalNumberOfTransaction] = newTransaction;
		totalNumberOfTransaction++;
	}

	public void showAllTranscation() {
		for(int i = 0; i < this.listOfTransaction.length ; i++) {
      if(this.listOfTransaction[i] != null) {
        this.listOfTransaction[i].showInfo();
      }
    }
	}

	public static void main(String args[]) {
		Account Bean = new Account("Bean", "1", 500);
		Account Charlie = new Account("Kingsman", "2", 200);
		Bean.deposit(10);
		Bean.withdraw(50);
		Charlie.deposit(30);
		Charlie.withdraw(30);
		Bean.transfer(25, Charlie);
		Bean.showAllTranscation();
	}
}
