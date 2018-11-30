package ac.kr.sunmoon;

public class Book implements Comparable{
	private String title;
	private String author;
	private int catalogueNumber;
	
	private Borrower borrower;
	
	public Book(String title, String author , int catalougeNumer){
		this.title = title;
		this.author = author;
		this.catalogueNumber = catalougeNumer;
		
	}
	public void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(catalogueNumber);
	}
	public Borrower getBorrower(){
		return borrower;
	}
	
	}

