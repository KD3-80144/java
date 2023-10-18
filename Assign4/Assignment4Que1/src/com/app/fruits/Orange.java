package com.app.fruits;

public class Orange extends Fruits
{
	public Orange()
	{
		super("Orange",2,"Orange",true);
		System.out.println("Orange added");
	}
	public String taste()
	{
		return "sour";
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
