/**
   Library Management System

Copyright (C) 2025 Emrullah Enis Çetinkaya and contributors

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

 **/

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
