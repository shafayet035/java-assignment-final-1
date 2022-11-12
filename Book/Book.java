public class Book {
	String bookName; 
	String bookAuthor; 
	String bookId;
	String bookType; 
	int bookCopy;

	static int bookCounter;

	Book() {};

	Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;

		this.bookCounter++;
	}

	public void showInfo() {
		System.out.println("Book Name: " + this.bookName);
		System.out.println("Book Author: " + this.bookAuthor);
		System.out.println("Book Id: " + this.bookId);
		System.out.println("Book Type: " + this.bookType);
		System.out.println("Book Copy: " + this.bookCopy);
	}

	public void addBookCopy(int x) {
		this.bookCopy = this.bookCopy + x;
	}

	static void showTotalBookInfo() {
		System.out.println("Total Number of book Object: " + bookCounter);
	}

	public static void main(String args[]) {
		Book B1 = new Book("Physics", "Saiful sir", "123", "Kufa", 1);
		Book B2 = new Book("Math", "Zerin", "1234", "Kufa", 1);
		Book B3 = new Book("Math", "Zerin", "1234", "Kufa", 1);
		
		B1.addBookCopy(10);
		B2.addBookCopy(5);

		B1.showTotalBookInfo();

		B1.showInfo();
		B2.showInfo();
	}
}