package CodeChallenge;

import java.util.Scanner;

public class BookUtil {
	
	static Scanner sc = new Scanner(System.in);
	static BookStore bs;
	static String bookID;
	static String bookName, authorName;
	static float bookPrice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
		System.out.println("1 -> Add Book\n2 -> Search By Title \n3 -> Search By Author \n4 ->Display All Boooks\n5 -> Exit");
		System.out.println("Select the options");
		
		int ch = sc.nextInt();  
		sc.nextLine();
		
		switch(ch) {
		case 1:
			addBook();
			break;
		
		case 2:
			searchByTitle();
			break;
			
		case 3:
			searchByAuthor();
			break;
			
		case 4:
			displayAllBooks();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Invalid Selection");
		
		}
		}
		
	}
	
	static void addBook() {
		System.out.println("Enter the book id");
		bookID = sc.nextLine();
		System.out.println("Enter the book name");
		bookName = sc.nextLine();
		System.out.println("Enter the book author name");
		authorName = sc.nextLine();
		System.out.println("Enter the book price");
		float bookPrice = sc.nextFloat();
		
		
		Book b1 = new Book(bookID, bookName, authorName, bookPrice);
		
		bs = new BookStore();
		bs.addBookBS(b1);
	}
	
	static void searchByTitle() {
		
		System.out.println("Enter the title of book");
		bookName = sc.nextLine();
		bs.searchByTitleBS(bookName);
		
	}
	
	static void searchByAuthor(){
		System.out.println("Enter the author of book");
		authorName = sc.nextLine();
		bs.searchByAuthorBS(authorName);
	}
	
	static void displayAllBooks() {
		
		bs.displayBookBS();
		
	}
	

}
