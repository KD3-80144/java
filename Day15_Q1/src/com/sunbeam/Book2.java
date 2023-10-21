package com.sunbeam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Book2 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		List<Book> li = new ArrayList<Book>();
		Comparator<Object> b;
		Book b1;
		int ind;
		int choice;
		do {
			
			System.out.println("-----------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new book in List");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn (hint - indexOf())");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list (hint - Collections.reverseList())");
			System.out.println("7. Save books in ﬁle.");
			System.out.println("8. Load books from ﬁle.");
			System.out.println("9. Exit.");
			System.out.println("Enter your choice = ");
			choice = scanner.nextInt();

			switch (choice) {

			case 1: // adding books
				b1 = new Book();
				b1.accept();

				if (li.contains(b1)) {
					ind = li.indexOf(b1);
					b1 = li.get(ind);
					b1.setQuantity(b1.getQuantity() + 1);
				}

				else {
					li.add(b1);
				}
				break;

			case 2: // printing books
				for (int i = 0; i < li.size(); i++) {
					System.out.println("Book at index " + i + ": " + li.get(i));
				}
				break;

			case 3: // Search a book with given isbn (hint - indexOf())
				System.out.println("Enter particular index to search = ");
				ind = scanner.nextInt();
				System.out.println("Book at index " + ind + ": " + li.get(ind));
//				b1 = li.get(ind);
				break;

			case 4: // delete at particular index
				System.out.println("Enter particular index to delete = ");
				ind = scanner.nextInt();
				li.remove(ind);
				System.out.println("Deleted.");
				break;

			case 5: // Check if book with given isbn is in list or not
				String isbn = scanner.next();
				Book key = new Book();
				System.out.println("Enter isbn to delete = ");
				key.setIsbn(isbn);
				if (li.contains(key)) {
					li.remove(key);
					System.out.println("ISBN = " + key + "\nDeleted");
				} else {
					System.out.println("ISBN NOT FOUND");
				}
				break;

			case 6:
				System.out.println("Reverse the order of books...");
				Collections.reverse(li);
				for(Book b2:li)
				System.out.println(b2);
				break;
			
			case 7:
				try(FileOutputStream fout = new FileOutputStream("book.bin")) {
					try(DataOutputStream dout = new DataOutputStream(fout)) {
						for(Book d : li) {
							dout.writeUTF(d.getIsbn());
							dout.writeUTF(d.getTitle());
							dout.writeUTF(d.getAuthor());
							dout.writeInt(d.getQuantity());
							dout.writeDouble(d.getPrice());
							
						}
					} // dout.close();
				} // fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("Movies saved.");
			break;
			
			case 8: 
				try(FileInputStream fin = new FileInputStream("book.bin")) {
					try(DataInputStream din = new DataInputStream(fin)) {
						while(true) {
							Book d = new Book();
							d.setIsbn( din.readUTF() );
							d.setTitle( din.readUTF() );
							d.setAuthor( din.readUTF() );
							d.setQuantity( din.readInt() );
							d.setPrice( din.readDouble() );
							System.out.println(d);
						}
					} // din.close();
				} // fin.close();
				catch (EOFException e) {
					// do nothing
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		} while (choice != 0);
		System.out.println("Thank you for using the app.");

	}

}