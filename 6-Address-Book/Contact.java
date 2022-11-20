public class Contact {
  private String personName;
  private String personId;
  private int age;
  private String mobileNumber;
  private char gender;

  Contact(){};
  Contact(String personName, String personId, int age, String mobileNumber,
      char gender) {
    this.personName = personName;
    this.personId = personId;
    this.age = age;
    this.mobileNumber = mobileNumber;
    this.gender = gender;
  }

  public void showPersonInfo() {
    System.out.println("Name: " + this.personName);
    System.out.println("Id: " + this
    .personId);
    System.out.println("Age: " + this.age);
    System.out.println("Mobile Number: " + this.mobileNumber);
    System.out.println("Gender: " + this.gender);
  }

  public void detectMobileOperator() {
    char operator = mobileNumber.charAt(2);
    if(operator == '7') {
      System.out.println("Mobile Operator is: GP");
    }
    if(operator == '8') {
      System.out.println("Mobile Operator is: Robi");
    }
    if(operator == '9') {
      System.out.println("Mobile Operator is: Banglalink");
    }
  }
}
