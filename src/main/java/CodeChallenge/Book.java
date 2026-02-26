package CodeChallenge;

class InvalidBookException extends Exception{
	public InvalidBookException(String str) {
		super(str);
	}
}


public class Book {

	private String bookID;
	private String bookName;
	private String authorName;
	private float bookPrice;

	public Book(String bookID, String bookName, String authorName, float bookPrice) {

		if (bookPrice > 0 && (bookID.length() == 4 && bookID.charAt(0) == 'B')) {
			this.bookID = bookID;
			this.bookName = bookName;
			this.authorName = authorName;
			this.bookPrice = bookPrice;
		} else {
			try {
			throw new InvalidBookException("InvalidBookException");
			}catch(InvalidBookException ibe) {
				System.out.println(ibe);
			}
			}
	}

	String getBookID() {
		return bookID;
	}

	String getBookName() {
		return bookName;
	}

	String getAuthor() {
		return authorName;
	}

	float getPrice() {
		return bookPrice;
	}
}
