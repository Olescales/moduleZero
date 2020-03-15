package by.htp.katokoleg.simpleclassandobject.task9;

import java.util.Scanner;

public class Library {

	private Book[] book;

	public Library(Book[] book) {
		this.book = book;
	}

	public Library() {

	}

	public Book[] getBook() {
		return book;
	}

	public Book[] outputDefAuthorBook(Book[] books) {

		Book[] bookArraySortByAuthors = new Book[books.length];

		System.out.println("Enter author for output: ");
		Scanner sc = new Scanner(System.in);
		String message = sc.next();

		int n = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthors().equals(message)) {
				bookArraySortByAuthors[n] = books[i];
				n++;
			}
		}
		return bookArraySortByAuthors;
	}

	public Book[] outputDefPublishingHouse(Book[] books) {

		System.out.println("Enter publishinghouse for output: ");
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		
		Book[] bookArraySortByPublishingHouse = new Book[books.length];
		int n = 0;
		for (int i = 0; i < books.length; i++) {
			if (message.equals(books[i].getPublishingHouse())) {
				bookArraySortByPublishingHouse[n] = books[i];
				n++;
			}
		}
		return bookArraySortByPublishingHouse;
	}

	public Book[] outputDefPublishingYear(Book[] book) {

		System.out.println("Enter publishing year for output: ");
		Scanner sc = new Scanner(System.in);
		int message = sc.nextInt();

		Book[] bookArraySortByPublishingYear = new Book[book.length];

		int n = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getYearPublished() > message) {
				bookArraySortByPublishingYear[n] = book[i];
				n++;
			}
		}
		return bookArraySortByPublishingYear;
	}

}
