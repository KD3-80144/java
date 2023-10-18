package com.assinment2.q3;

import java.util.Scanner;

public class Date 
{
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);
	public Date() 
	{
	
	}
	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() 
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void accept()
	{
		System.out.println("Enter Day:");
		this.day=sc.nextInt();
		System.out.println("Enter Month:");
		this.month=sc.nextInt();
		System.out.println("Enter Year:");
		this.year=sc.nextInt();
		
	}
	public void display()
	{
		System.out.print("dd/MM/yyy="+this.day);
		System.out.print("/"+this.month);
		System.out.print("/"+this.year);
	}
}
