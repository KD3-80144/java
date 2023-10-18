package com.rutvikjavaprograms;

import java.util.Scanner;

public class BaseSalariedCommissionEmployee extends CommissionEemployee implements EmployeeInterFace
{
  private double baseSalary;
  Scanner sc = new Scanner(System.in);

  public BaseSalariedCommissionEmployee() 
  {
  	super();
  }  
public BaseSalariedCommissionEmployee(String firstName, String lastName, int socialSecurityNumber,double grossSales, double commissionRate, double baseSalary) 
{
	super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
	this.baseSalary = baseSalary;
}

public double getBaseSalary() 
{
	return baseSalary;
}

public void setBaseSalary(double baseSalary) 
{
	this.baseSalary = baseSalary;
}
public void accept()
{
	super.accept();
	System.out.println("Enter your Base salary:");
	this.baseSalary=sc.nextDouble();
	
}
public void display()
{
	super.display();
    System.out.println("Base salary:"+this.baseSalary);
}
public void calTotSal()
{
	double totalSal=((this.getCommissionRate())*(this.getGrossSales()))+this.getBaseSalary();
	System.out.println("Total salary:"+totalSal);
}
  
}
