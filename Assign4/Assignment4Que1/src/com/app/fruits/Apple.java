package com.app.fruits;

public class Apple extends Fruits
{
	public Apple()
	{
		super("Red",2,"Apple",true);
		System.out.println("Apple added");
	}
	
	public String taste()
	{
		return "sweet and sour";
	}
	public void add()
	{
		super.add();
		System.out.println("Press 1 if fruit is fresh otherwise press 0");
		this.check=sc.nextInt();
		if (this.check==1)
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
