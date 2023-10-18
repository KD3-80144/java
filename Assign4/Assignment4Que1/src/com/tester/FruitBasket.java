package com.tester;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket 
{

	public static void main(String[] args) 
	{
		int choice;
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your basket:");
		int size=sc.nextInt();
		Fruits []fruits=new Fruits[size];
		do 
		{
			System.out.println("0.To Exit");
			System.out.println("1.To Add Apple");
			System.out.println("2.To Add Mango");
			System.out.println("3.To Add Orange");
			System.out.println("4.To Display names of all fruits in the basket.");
			System.out.println("5.To Display name,color,weight , taste of all fresh fruits , in the basket..");
			System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7.Mark a fruit as stale.");
			System.out.println("8.Mark all sour fruits stale");
			
			choice=sc.nextInt();
			
			switch (choice) 
			{
			case 1:
				if(index>size-1)
				{
			     System.out.println("Your basket is full!!!!!");
			     break;
				}
				else {
				fruits[index]=new Apple();
				//fruits[index].add();
				index++;
				}
				break;
			case 2:
				if(index>size-1)
				{
			     System.out.println("Your basket is full!!!!!");
			     break;
				}
				else {
				fruits[index]=new Mango();
				//fruits[index].add();
				index++;
				}
				break;
			case 3:
				if(index>size-1)
				{
			     System.out.println("Your basket is full!!!!!");
			     break;
				}
				else {
				fruits[index]=new Orange();
				//fruits[index].add();
				index++;
				}
				break;	
			case 4:
				for(Fruits fru:fruits)
				{
					if(fru!=null)
					System.out.println(fru.getName());
				}	
				break;
			case 5:
				for(Fruits fru:fruits)
					if(fru!=null) 
					{
						if(fru.isFresh())
						fru.display();
					 }
				break;
			case 6:
				for(Fruits fru:fruits)
				{
				if(fru!=null)
				{	
				  if ((fru.isFresh()==false))
				  {
				    System.out.println(fru.taste()); 
				  }
				}
				}	
				break;
            case 7:
            	System.out.println("Enter the index:");
            	int in= sc.nextInt();
            	if(index>size-1) {
            	fruits[in].setFresh(false);
            	System.out.println("Fruit markked as stale!!!!");
            	}
            	else
            		System.out.println("Enter a valid index!");
				break;	
			case 8:
				for(Fruits fru:fruits)
				{
				if(fru!=null)
				{
				  if ((fru.taste()=="sour"))
				  {
				    fru.setFresh(false);
				    System.out.println("Sour fruit marked as stale");
				  }
				}
				}	
				break;	
					
			default:
				break;
			}	
		} while (choice!=0);
	}
}
