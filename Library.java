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
				System.out.println("�̹� ��ϵǾ��ִ� �̿����Դϴ�");
				break;
			}
				
		}
		Borrower p = new Borrower(name, borrowerNumber);
		registeredBorrowers.add(p);
		System.out.println("��Ͽ� �����Ͽ����ϴ�.");
	
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
			
			//���� ���� ����/ ���� �Ұ��� ���� 
				
			}
		
		Iterator iter_book = registeredBooks.iterator();
		while(iter_book.hasNext() == true){
			Book book =(Book)iter.next();
			if (book.getBook() == catalogueNumber){
				book.getBorrower();
				System.out.println("���⿡ �����Ͽ����ϴ�.");
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

