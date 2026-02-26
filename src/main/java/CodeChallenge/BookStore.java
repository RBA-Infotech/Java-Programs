package CodeChallenge;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

	static List<Book> l1 = new ArrayList<Book>();

	void addBookBS(Book b1) {
		l1.add(b1);
	}

	void displayBookBS() {

		System.out.println("BookID \t Book Title \t Book Author \t Book Price");
		for (Book b1 : l1) {
			System.out.println(b1.getBookID() + "\t" + b1.getBookName() + "\t" + b1.getAuthor() + "\t" + b1.getPrice());
		}
	}

	void searchByTitleBS(String bookName) {
		boolean flag = false;
		for (Book b1 : l1) {
			if (b1.getBookName().equals(bookName)) {
				System.out.println(
						b1.getBookID() + "\t" + b1.getBookName() + "\t" + b1.getAuthor() + "\t" + b1.getPrice());
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("No book with this title");
		}

	}
	
	void searchByAuthorBS(String authorName) {
		boolean flag = false;
		for (Book b1 : l1) {
			if (b1.getAuthor().equals(authorName)) {
				System.out.println(
						b1.getBookID() + "\t" + b1.getBookName() + "\t" + b1.getAuthor() + "\t" + b1.getPrice());
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("No book with this Author name");
		}
	}

}
