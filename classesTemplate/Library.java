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
