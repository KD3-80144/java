package com.app.geometry;
import java.lang.Math;

public class Point2D 
{
	private int x;
	private int y;
	
	public Point2D()
	{
		this(10,20);
	}
	public Point2D(int x, int y) 
	{
		this.x = x;
		this.y = y;
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
