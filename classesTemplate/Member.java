package classesTemplate;

import java.util.ArrayList;

public class Member {
	private String name;
	private int memberID;
	private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

	public String getName() {
		return name;


	}

	public void setName(String name) {
		this.name = name;


	}

	public int getMemberID() {
		return memberID;


	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;


	}

	public Member(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;


	}

	public void borrowBook(Book book) {
		boolean isavailable = book.borrowBook();
		if (isavailable) {

			borrowedBooks.add(book);
			book.borrowedMember = this;

		}


	}

	public void returnBook(Book book) {
		book.returnBook();
		borrowedBooks.remove(book);


	}

}
