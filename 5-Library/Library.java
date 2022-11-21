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
        this.books[i].showInfo();
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
    Library Library = new Library("The Library", "Universe-5");
    Book B1 = new Book("The lord of the rings", "J. R. R. Tolkien", "1", "Fantasy", 50);
    Book B2 = new Book("One Punch Man", "Yusuke Murata", "2", "Shonen manga", 80);

    Library.addNewBook(B1);
    Library.addNewBook(B2);

    Library.addNewBookCopy(B1, 10);
    Library.addNewBookCopy(B2, 15);

    Library.showLibInfo();
  }


}
