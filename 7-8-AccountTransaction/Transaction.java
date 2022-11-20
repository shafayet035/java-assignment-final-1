public class Transaction {
  private Account sender;
  private Account receiver;
  private int amount;
  private String additionalInfo;

  Transaction(){}

  Transaction(Account sender, Account receiver, int amount) {
    this.sender = sender;
    this.receiver = receiver;
    this.amount = amount;
  }

  public void showInfo() {
    System.out.println("---------------");
    System.out.println("Sender Name: " + this.sender.getAccountName());
    System.out.println("Sender Id: " + this.sender.getAccountId());
    System.out.println("Receiver Name: " + this.receiver.getAccountName());
    System.out.println("Receiver Id: " + this.receiver.getAccountId());
    System.out.println("Amount: " + this.amount);
    System.out.println("---------------");
  }
}
