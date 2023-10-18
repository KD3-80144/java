import java.util.*;
public class Menu {

	public static void main(String[] args) 
	{
		int choice;
		int dosaCount=0;
		int samosaCount=0;
		int idliCount=0;
		do {
			System.out.println("****************************");
			System.out.println("0.To Exit");
			System.out.println("1.For dosa");
			System.out.println("2.For Samosa");
			System.out.println("3.For Idli");
			System.out.println("4.For calculate Bill");
			System.out.println("****************************");
			Scanner sc= new Scanner(System.in);
			choice=sc.nextInt();
			
			switch (choice) 
			{
			case 0:
				System.out.println("Visit again!!!!");
				break;
			case 1:
				System.out.print("Enter Quantity:");
				int dosaQtyTotal=sc.nextInt();
				dosaCount+=dosaQtyTotal;
				System.out.println(dosaCount+" plate dosa added");
				break;
			case 2:
				System.out.print("Enter Quantity:");
				int samosaQtyTotal=sc.nextInt();
				samosaCount+=samosaQtyTotal;
				System.out.println(samosaCount+" plate samosa added");
				break;
			case 3:
				System.out.print("Enter Quantity:");
				int idaliQtyTotal=sc.nextInt();
				idliCount+=idaliQtyTotal;
				System.out.println(idliCount+" plate idli added");
				break;
			case 4:
				int totalBill=(dosaCount*50)+(samosaCount*30)+(idliCount*20);
				System.out.println("Your total bill="+totalBill);

			default:
				break;
			}	
		} while (choice!=0);

	}

}
