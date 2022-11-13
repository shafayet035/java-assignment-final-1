public class Library {
  private String libName;
  private String libAddress;
  private Book [] books = new Book[1000];
  private int totalBook;

  Library() {}
  Library(String libName, String libAddress) {
    this.libName = libName;
    this.libAddress = libAddress;
  }

  public void showLibInfo() {
    System.out.println("Library Name: " + this.libName);
    System.out.println("Library Address: " + this.libAddress);

    for(int i = 0; i < this.books.length ; i++) {
      if(this.books[i] != null) {
        System.out.println("Book Name: " + this.books[i].getBookName());
    		System.out.println("Book Author: " + this.books[i].getBookAuthor());
    		System.out.println("Book Id: " + this.books[i].getBookId());
    		System.out.println("Book Type: " + this.books[i].getBookType());
    		System.out.println("Book Copy: " + this.books[i].getBookCopy());
      }
    }
  }

  public void addNewBook(Book book) {
    books[totalBook] = book;
    totalBook++;
  }

  public void addNewBookCopy(Book book, int copy) {
    book.addBookCopy(copy);
  }

  public static void main(String args[]) {
    Library L = new Library("World Library", "Uganda");
    Book B1 = new Book("Math", "Mr.Y", "1234", "Kufa", 1);
    Book B2 = new Book("Physics", "Mr.X", "1231", "Kufa", 1);

    L.addNewBook(B1);
    L.addNewBook(B2);

    L.addNewBookCopy(B1, 10);
    L.addNewBookCopy(B2, 15);

    L.showLibInfo();
  }


}
