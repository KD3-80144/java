package com.rutvikjavaprograms;

import java.util.Scanner;

abstract public class Employees implements EmployeeInterFace
{
	private String firstName;
	private String lastName;
	private int socialSecurityNumber;
	Scanner sc = new Scanner(System.in);
	
	public Employees() 
	{
		
	}
	public Employees(String firstName, String lastName, int socialSecurityNumber) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public int getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) 
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public void accept()
	{
		System.out.println("Enter frist name:");
		this.firstName=sc.next();
		System.out.println("Enter last name:");
		this.lastName=sc.next();
		System.out.println("Enter social security number:");
		this.socialSecurityNumber=sc.nextInt();	
	}
	public void display()
	{
		System.out.println("Frist Name:"+this.firstName);
		System.out.println("Last Name:"+this.lastName);
		System.out.println("Social security number:"+this.socialSecurityNumber);	
	}
    abstract public void calTotSal();

	
	
	

}
