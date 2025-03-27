package classesTemplate;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		Book firstBook = new Book("Rüya Avcısı", "Stephen King", 126);
		Book secondBook = new Book("Anna Karennina", "Tolstoy", 130);
		Book thirdBook = new Book("Hayvan Çiftliği", "George Orwell", 300);

		Member ali = new Member("Ali", 4563);
		Member ahmet = new Member("Ahmet", 3067);
		myLibrary.addBook(firstBook);
		myLibrary.addBook(secondBook);
		myLibrary.addBook(thirdBook);
		myLibrary.addMember(ahmet);
		myLibrary.addMember(ali);
		myLibrary.displayAvailableBooks();
		ali.borrowBook(thirdBook);
		myLibrary.displayBook(thirdBook);


	}

}
