package com.rutvikjavaprograms;
import java.lang.Math;
import java.util.Scanner;

public class Point2D 
{
	private int x;
	private int y;
	Scanner sc =new Scanner(System.in);
	public Point2D()
	{
		this(10,20);
	}
	public Point2D(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	public void accept()
	{
		System.out.println("Enter the x point:");
		this.x=sc.nextInt();
		System.out.println("Enter the y point:");
		this.y=sc.nextInt();
	}
	public void display()
	{
		System.out.println("X axis:"+this.x);
		System.out.println("Y axis:"+this.y);
		
	}
	
	public boolean isEqualTo(Point2D p2)
	{
		if(this.x==p2.x && this.y==p2.y)
		    return true;
		else
			return false;
	}
	public void calDistance(Point2D p2)
	{
		System.out.println(Math.sqrt(Math.pow(2, (this.x-p2.x))+Math.pow(2, (this.y-p2.y))));
		
	}
	
	

}