package com.sunbeam;


import java.util.*;

public class Book {
	String isbn;
	String title;
	String author;
	int quantity;
	double price;

	public Book(String isbn, String title, String author, int quantity, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Scanner scanner = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter isbn = ");
		isbn = scanner.next();
		System.out.println("Enter title = ");
		title = scanner.next();
		scanner.nextLine();
		System.out.println("Enter author = ");
		author = scanner.nextLine();
		System.out.println("Enter quantity = ");
		quantity = scanner.nextInt();
		System.out.println("Enter price = ");
		price = scanner.nextDouble();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Book) 
		{
		Book other = (Book) obj;
		if(this.isbn.equals(other.isbn))
		return true;
		
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
		
	}
	
	

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	public static void main(String[] args) {
		
		
		
		Set<Book> set = new LinkedHashSet<>();
		set.add(new Book("AAA", "Radhey", "ShivajiSawant", 100, 500));
		set.add(new Book("BBB", "Yayati", "VSKhandekar", 200, 600));
		set.add(new Book("CCC", "Ekchapyla", "PLDeshpande", 300, 800));
		set.add(new Book("DDD", "Fakira", "AnnabhauSathe", 400, 900));
		set.add(new Book("AAA", "Agnipankh", "Apjkalam", 800, 1000));//duplicate added to hashset
		
		Iterator <Book> b1 = set.iterator();
		while(b1.hasNext())
		{
			Book b2 = b1.next();
			System.out.println(b2);
		}
	}	

}
