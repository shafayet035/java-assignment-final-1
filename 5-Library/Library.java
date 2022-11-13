public class Library {
  String libName;
  String libAddress;
  Book [] books = new Book[1000];
  int totalBook;

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
        System.out.println("Book Name: " + this.books[i].bookName);
    		System.out.println("Book Author: " + this.books[i].bookAuthor);
    		System.out.println("Book Id: " + this.books[i].bookId);
    		System.out.println("Book Type: " + this.books[i].bookType);
    		System.out.println("Book Copy: " + this.books[i].bookCopy);
      }
    }
  }

  public void addNewBook(Book book) {
    books[totalBook + 1] = book;
    totalBook++;
  }

  public void addNewBookCopy(Book book, int copy) {
    book.bookCopy = book.bookCopy + 1;
  }

  public static void main(String args[]) {
    Library L = new Library("World Library", "Uganda");
    Book B1 = new Book("Math", "Mr.Y", "1234", "Kufa", 1);
    Book B2 = new Book("Physics", "Mr.X", "1231", "Kufa", 1);

    L.addNewBook(B1);
    L.addNewBook(B2);

    L.showLibInfo();
  }


}
