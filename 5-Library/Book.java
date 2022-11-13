public class Book {
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;

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

	public String getBookName() {
		return this.bookName;
	}
	public String getBookAuthor() {
		return this.bookAuthor;
	}
	public String getBookId() {
		return this.bookId;
	}
	public String getBookType() {
		return this.bookType;
	}
	public int getBookCopy() {
		return this.bookCopy;
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
}
