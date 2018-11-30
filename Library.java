package ac.kr.sunmoon;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Library {
	private String name;
	private TreeSet<Book> registeredBooks;
	private HashSet<Borrower> registeredBorrowers;
	
	public Library(String name){
		this.name = name;
		registeredBooks = new TreeSet<Book>();
		registeredBorrowers = new HashSet<Borrower>();
	}
	
	public void registerOneBorrower(String name){
		Borrower b = new Borrower(name);
		registeredBorrowers.add(b);
	}
	public void registerOneBook(String title, String author, int catalogueNumber){
		Book b = new Book(title, author, catalogueNumber);
		registeredBooks.add(b);
	}
	public void displayBooksForLoan(){
		Iterator iter = registeredBooks.iterator();
		while(iter.hasNext()== true){
			Book book =(Book)iter.next();
			if(book.getBorrower() == null)
				book.display();
		}
	}
	public void lendOneBook(String name,int catalogueNumber){
		
	}
	public void returnOneBook(int catalogueNumber){
		
	}
}

