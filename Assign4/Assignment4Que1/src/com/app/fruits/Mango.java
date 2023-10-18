package com.app.fruits;

public class Mango extends Fruits
{
	public Mango()
	{
		super("Yello",2,"Mango",true);
		System.out.println("Mango added");
	}
	public String taste()
	{
		return "Sweet";
	}
	public void add()
	{
		super.add();
		System.out.println("Press 1 if fruit is fresh otherwise press 0");
		int check=sc.nextInt();
		if (check==1)
		{
			setFresh(true);
		}
		else
			setFresh(false);	
	}
	public void display()
	 {
		System.out.println("********************************");
		 super.display();
		 if (this.isFresh())
		 {
			System.out.println("Fruit is fresh.....");
		 }
		 else
		 {
			 System.out.println("Fruit is not fresh.....");
		 }
		 System.out.println("********************************");
			 
	 }
	
}
