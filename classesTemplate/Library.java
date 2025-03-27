package classesTemplate;

import java.util.ArrayList;

public class Library {
	public ArrayList<Book> books = new ArrayList<Book>();
	public ArrayList<Member> members = new ArrayList<Member>();

	public void addBook(Book book) {
		books.add(book);


	}

	public void addMember(Member member) {
		members.add(member);


	}

	public void displayAvailableBooks() {
		if (books.isEmpty()) {

			System.out.print("Kütüphane boş!");

		} else {

			for (int i = 0; i < books.size(); i++) {

				books.get(i).displayInfo();

			}

		}


	}

	public void displayBook(Book book) {

		book.displayInfo();


	}

}
