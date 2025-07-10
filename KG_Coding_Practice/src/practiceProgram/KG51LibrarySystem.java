package practiceProgram;

/*51. Create a Book class for a library system.
Instance variables: title, author, isbn.
Static variable: totalBooks, a counter for the total number of book instances.
Instance methods: borrowBook(), returnBook().
Static method: getTotalBooks(), to get the total number of books in the library.*/

public class KG51LibrarySystem {
	static int totalNoOfBooks;
	String author;
	String title;
	String isbn;
	boolean isBorrowed;
	
	static {
		totalNoOfBooks = 0;
	}
	{
		totalNoOfBooks++;
	}
	
	KG51LibrarySystem(String isbn, String title, String author){
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	
	KG51LibrarySystem(String isbn){
		this(isbn,"Unknown", "Unknown");
	}
	
	static int getTotalNoOfBooks() {
		System.out.print("TotalNoOfBooks in the library: ");
		return totalNoOfBooks;
	}
	
	void borrowBook() {
		if(isBorrowed) {
			System.out.println("Book is already borrowed.");
		}else {
			this.isBorrowed = true;
			System.out.println("Enjoy the book '" + this.title + "'.");
		}
	}
	
	void returnBook() {
		if(isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope you enjoyed, please leave review.");
		}else {
			System.out.println("This book is already in the library.");
		}
	}
	
	public static void main(String[] args) {
		KG51LibrarySystem designOfThings = new KG51LibrarySystem("1", "Design", "Author");
		KG51LibrarySystem myBook = new KG51LibrarySystem("2");
		
		System.out.println(KG51LibrarySystem.getTotalNoOfBooks());
		designOfThings.borrowBook();
		myBook.borrowBook();
		designOfThings.borrowBook();
		designOfThings.returnBook();
		designOfThings.returnBook();
	}

}
