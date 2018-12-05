package ac.kr.sunmoon;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Library {
	
	public String name;
	private TreeSet<Book> registeredBooks;
	private HashSet<Borrower> registeredBorrowers;
	
	public void Library(String name){
		this.name = name;
		registeredBooks = new TreeSet<Book>();
		registeredBorrowers = new HashSet<Borrower>();
	}
	
	public void registerOneBorrower(String name,int studentNumber){
		Borrower p = new Borrower(name, studentNumber);
		registeredBorrowers.add(p);
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
	public void displayBooksOnLoan(){
		Iterator iter = registeredBooks.iterator();
		while(iter.hasNext()== true){
			Book book =(Book)iter.next();
			//null 대신 어떤 값을 너어야 하는지 알아보기
			if(book.getBorrower() == null)
				book.display();
		}
	}
	public void lendOneBook(String name,int catalogueNumber,int studentNumber){
		Iterator iter = registeredBorrowers.iterator();
		while(iter.hasNext() == true){
			Borrower borrower =(Borrower)iter.next();
			if (borrower.toString() == name){
				
			}
		
		Iterator iter_book = registeredBooks.iterator();
		while(iter_book.hasNext() == true){
			Book book =(Book)iter.next();
			if (book.getBook() == catalogueNumber){
				book.getBorrower();
				borrower.getBook();
			}
		
		}}
		System.out.println("대출에 성공하였습니다.");
		}
	
	
	public void returnOneBook(int catalogueNumber){
		Iterator iter = registeredBooks.iterator();
		while(iter.hasNext() == true){
			Book book = (Book)iter.next();
			if(book.getBook() == catalogueNumber){
				//book.getBorrower() == null;
				
			}
		}
	}
	
	public void searchBorrower(int borrowerNuber){
		
	}
	
	
}

