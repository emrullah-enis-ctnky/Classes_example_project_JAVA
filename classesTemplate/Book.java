package classesTemplate;

public class Book {
	private String title;
	private String author;
	private int isbn;
	private boolean isAvailable = true;

	public Member borrowedMember;

	public String getTitle() {
		return title;


	}

	public void setTitle(String title) {
		this.title = title;


	}

	public String getAuthor() {
		return author;


	}

	public void setAuthor(String author) {
		this.author = author;


	}

	public int getIsbn() {
		return isbn;


	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;


	}

	public Member getBorrowedMember() {
		return borrowedMember;


	}

	public void setBorrowedMember(Member borrowedMember) {
		this.borrowedMember = borrowedMember;


	}

	public Book(String title, String author, int isbn) {
		this.author = author;

		this.isbn = isbn;
		this.title = title;


	}

	public void displayInfo() {
		System.out.println("Kitap ismi=" + title + "\nYazar=" + author + "\nISBN=" + isbn);
		if (isAvailable) {

			System.out.println("Kitap ödünç alınabilir.");

		} else {

			System.out.println(borrowedMember.getName() + " kitabı almış!");

		}


	}

	public boolean borrowBook() {
		if (isAvailable) {

			isAvailable = false;
			return true;

		} else {

			System.out.println("Kitap daha önce ödünç verilmiş!");
			return false;

		}


	}

	public void returnBook() {
		isAvailable = true;


	}

}
