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
	
	public void registerOneBorrower(String name,int borrowerNumber){
		Iterator iter = registeredBorrowers.iterator();
		while(iter.hasNext()== true){
			Borrower borrower =(Borrower)iter.next();
			if(borrower.equals(name)){
				System.out.println("이미 등록되어있는 이용자입니다");
				break;
			}
				
		}
		Borrower p = new Borrower(name, borrowerNumber);
		registeredBorrowers.add(p);
		System.out.println("등록에 성공하였습니다.");
	
		}
	public void registerOneBook(String title, String author,int catalogueNumber ){
		Iterator iter = registeredBooks.iterator();
		while(iter.hasNext()== true){
			Book book =(Book)iter.next();
			if(book.equals(title)){
				catalogueNumber += 1 ;
			}
			else{
				
			}
		Book b = new Book(title, author, catalogueNumber);
		registeredBooks.add(b);
	}
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
			
			if(book.getBorrower() != null)
				book.display();
		}
	}
	public void lendOneBook(String name,int catalogueNumber,int studentNumber){
		Iterator iter = registeredBorrowers.iterator();
		while(iter.hasNext() == true){
			Borrower borrower =(Borrower)iter.next();
			borrower.equals(name);
			
			//대출 가능 상태/ 대출 불가능 상태 
				
			}
		
		Iterator iter_book = registeredBooks.iterator();
		while(iter_book.hasNext() == true){
			Book book =(Book)iter.next();
			if (book.getBook() == catalogueNumber){
				book.getBorrower();
				System.out.println("대출에 성공하였습니다.");
			}
		
		}}
		
		
	
	
	public void returnOneBook(int catalogueNumber){
		Iterator iter = registeredBooks.iterator();
		while(iter.hasNext() == true){
			Book book = (Book)iter.next();
			if(book.getBook() == catalogueNumber){
				//book.getBorrower() == null;
				
			}
		}
	}
	
	public void reserve(int borrowerNuber){
		
	}
	
	
}

