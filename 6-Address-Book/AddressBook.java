public class AddressBook {
  private String ownerName ;
  private String info ;
  private Contact []listOfContact = new Contact[1000];
  private int totalContact;

  AddressBook(){}

  AddressBook(String ownerName, String info) {
    this.ownerName = ownerName;
    this.info = info;
  }

  public void showAllContactInfo() {
    System.out.println("Address Book Owner Name: " + this.ownerName);
    System.out.println("Address Book Info: " + this.info);

    for(int i = 0; i < this.listOfContact.length ; i++) {
      if(this.listOfContact[i] != null) {
        this.listOfContact[i].showPersonInfo();
      }
    }
  }

  public void addContact(Contact con) {
    listOfContact[totalContact] = con;
    totalContact++;
  }

  public static void main(String args[]) {
    AddressBook A = new AddressBook("My Address Book", "Some info given");
    Contact C1 = new Contact("Abul", "123", 20, "01776662986", 'M');
		Contact C2 = new Contact("Abul Karim", "1213", 201, "01776662926", 'M');
    A.addContact(C1);
    A.addContact(C2);
    A.showAllContactInfo();
	}
}
