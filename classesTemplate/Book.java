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
