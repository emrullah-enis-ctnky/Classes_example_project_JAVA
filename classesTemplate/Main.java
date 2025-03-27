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
