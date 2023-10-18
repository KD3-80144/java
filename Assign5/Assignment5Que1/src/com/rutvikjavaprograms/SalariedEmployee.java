package com.rutvikjavaprograms;

import java.util.Scanner;

public class SalariedEmployee extends Employees implements EmployeeInterFace
{
	private double weeklySalary;
	Scanner sc = new Scanner(System.in);
	public SalariedEmployee() 
	{
		super();
	}

	public SalariedEmployee(String firstName, String lastName, int socialSecurityNumber,double weeklySalary) 
	{
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter weekly salary:");
		this.weeklySalary=sc.nextDouble();
	}
    public void display()
    {
    	super.display();
        System.out.println("Weekly Salary:"+this.weeklySalary);
    }
    public void calTotSal()
    {
    	double totalSalary=this.weeklySalary+this.weeklySalary*1.1;
    	System.out.println("Weekly Salary after adding reward:"+totalSalary);
    }

}
