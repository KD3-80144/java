package que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<Book> li = new ArrayList<Book>();
		Book b1;
		int ind;
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // adding books
				b1= new Book();
				b1.accept();
				if(li.contains(b1))
				{
					ind =li.indexOf(b1);
					b1= li.get(ind);
					b1.setQuantity(b1.getQuantity()+1);
				
				}
				else
					{
					li.add (b1);
					}
				break;

			case 2: // printing books
				for (int i=0; i < li.size();i++) 
				{
					b1 = li.get(i); 
					System.out.println(b1);
				}
				break;
			case 3: // delete at particular index
				System.out.println("Enter particular index to delete = ");
				ind = sc.nextInt();
				li.remove(ind);
				break;
			case 4: // Check if book with given isbn is in list or not
				String isbn = sc.next();
				Book key = new Book();
				System.out.println("Enter isbn to check = ");
				key.setIsbn(isbn);
				if (li.contains(key)) {
					System.out.println("FOUND");
				} else {
					System.out.println("NOT FOUND");
				}
				break;
			case 5:
				li.clear();
				break;
			case 6:
				System.out.println("Reverse the order of book:");
				Collections.reverse(li);
				for (Book book : li) 
				{
						System.out.println(book);
				}
		
				break;
			case 7:
				Book1 comparator = new Book1();
				li.sort(comparator);
				break;
			}
		} while (choice != 0);
		
	}
}

	
