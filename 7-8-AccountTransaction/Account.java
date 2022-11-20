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
		Account Leo = new Account("Leon", "420", 100);
		Account King = new Account("Kingsman", "001", 50);
		Leo.deposit(10);
		Leo.withdraw(50);
		King.deposit(30);
		King.withdraw(30);
		Leo.transfer(25, King);
		Leo.addTransaction(Leo, King, 5000);
		Leo.addTransaction(Leo, King, 2000);
		Leo.addTransaction(Leo, King, 3000);
		Leo.addTransaction(Leo, King, 4000);
		Leo.showAllTranscation();
	}
}
