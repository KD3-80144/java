package com.sunbeam;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Book> map = new HashMap<String, Book>();
		int choice;
		Book b;
		do {
			System.out.println("1.insert in map \n2.Find in map ");
			System.out.println("Enter choice = ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				b = new Book();
				b.accept();
				map.put(b.getIsbn(), b);

				break;
			case 2:
				System.out.println("Enter isbn to search in map");
				String isbn = sc.next();
				Book s = map.get(isbn);
				if(s==null)
				System.out.println("isbn not found");
				else
					System.out.println("isbn found");
				break;
			

			}

		} while (choice != 0);

	}

}
