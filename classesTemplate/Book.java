package classesTemplate;

public class Book {
	private String title;
	private String author;
	private int isbn;
	private boolean isAvailable;

	public Book(String title, String author, int isbn, boolean isAvailable) {
		this.author = author;
		this.isAvailable = isAvailable;
		this.isbn = isbn;
		this.title = title;


	}

	public void displayInfo() {
		System.out.println("Kitap ismi=" + title + "\nYazar=" + author + "\nISBN=" + isbn);


	}

	public void borrowBook() {
		if (isAvailable) {

			isAvailable = false;

		} else {

			System.out.println("Kitap daha önce ödünç verilmiş!");

		}


	}

	public void returnBook() {
		isAvailable = true;


	}

}
