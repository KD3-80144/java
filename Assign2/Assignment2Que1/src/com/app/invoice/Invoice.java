package com.app.invoice;

import java.util.Scanner;

public class Invoice 
{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	Scanner sc= new Scanner(System.in);
	
	public Invoice() 
	{
	
	}
	public Invoice(String partNumber, String partDescription, int quantity,double price) 
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price=price;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPartNumber()
	{
		return partNumber;
	}

	public void setPartNumber(String partNumber) 
	{
		this.partNumber = partNumber;
	}

	public String getPartDescription() 
	{
		return partDescription;
	}

	public void setPartDescription(String partDescription) 
	{
		this.partDescription = partDescription;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public void accept()
	{
		System.out.println("Enter part number");
		partNumber=sc.next();
		System.out.println("Enter part description:");
		partDescription=sc.next();
		System.out.println("Enter quantity:");
		quantity=sc.nextInt();
		if(this.quantity<0)
		    {
			this.quantity=0;
		    }
		System.out.println("Enter part price:");
		price=sc.nextDouble();
		if(this.price<0)
	    {
		this.price=0;
	    }
	}
	public void display()
	{
		System.out.println("Part number:"+partNumber);
		System.out.println("Part description:"+partDescription);
		System.out.println("Part Quantity:"+quantity);
		System.out.println("Part Price:"+price);
	}
	public void calPrice()
	{
		double total=this.quantity*this.price;
		System.out.println("Your bill="+total);
		
	}
	
}

