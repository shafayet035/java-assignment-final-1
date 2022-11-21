public class Mobile {

  private String mobileOwnerName;
  private String mobileNumber;
  private String mobileBalance;
  private String mobileOSName;
  private boolean lock;

  Mobile(){}

  Mobile(String mobileOwnerName, String mobileNumber, String mobileBalance, String mobileOSName, boolean lock) {
    this.mobileOwnerName = mobileOwnerName;
    this.mobileNumber = mobileNumber;
    this.mobileBalance = mobileNumber;
    this.mobileOSName = mobileOSName;
    this.lock = lock;
  }

  public void showInfo() {
    if(lock == false) {
      System.out.println("Mobile Owner: " + this.mobileOwnerName);
      System.out.println("Mobile Number: " + this.mobileNumber);
      System.out.println("Mobile Balance: " + this.mobileBalance);
      System.out.println("Mobile OS: " + this.mobileOSName);
    } else {
      System.out.println("Please unlock your phone!");
    }
  }

  public void callSomeone(int timeDuration) {
    // taking the time duration in second
    
    if(lock == false){
      System.out.println("Total Cost of the call: " + (timeDuration /  60) * 1);
    } else {
      System.out.println("Please unlock your phone!");
    }
  }

  public static void main(String args[]) {
    Mobile M = new Mobile("John Cena", "01715131956", "10", "IOS", false);
    M.showInfo();
    M.callSomeone(300);
	}
}
