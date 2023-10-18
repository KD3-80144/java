package com.rutvikjavaprograms;

import java.util.Scanner;

public class HourlyEmployees extends Employees implements EmployeeInterFace
{
	private int hrs;
	private double hourlyWages;
	Scanner sc = new Scanner(System.in);
	public HourlyEmployees() 
	{
		super();
	}
	public HourlyEmployees(String firstName, String lastName, int socialSecurityNumber,int hrs, double hourlyWages) 
	{
		super(firstName,lastName,socialSecurityNumber);
		this.hrs = hrs;
		this.hourlyWages = hourlyWages;
	}
	public int getHrs() 
	{
		return hrs;
	}
	public void setHrs(int hrs) 
	{
		this.hrs = hrs;
	}
	public double getHourlyWages() 
	{
		return hourlyWages;
	}
	public void setHourlyWages(double hourlyWages) 
	{
		this.hourlyWages = hourlyWages;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter no of hrs you worked:");
		this.hrs=sc.nextInt();
		System.out.println("Enter Hourly wages:");
		this.hourlyWages=sc.nextDouble();
	}
    public void display()
    {
    	super.display();
        System.out.println("No. of hours:"+this.hrs);
        System.out.println("Hourly wages:"+this.hourlyWages);
    }
    public void calTotSal()
    {
    	double totalSalary;
    	
    	if(this.hrs>=40)
    	{
    		totalSalary=(this.hourlyWages*1.5)*this.hrs;
    	}
    	else
    		totalSalary=this.hourlyWages*this.hrs;
    	
    	System.out.println("Your total salary"+totalSalary);
    }

	
	

}
