package com.sunbeam.creaditcalculator;

import java.util.Scanner;

public class CreditCal 
{
  private int accountNo=10001;
  private int monthBegnBal=100000;
  private int totalExpenses;
  private int allowedCreditLimit=150000;
  private int chargesApplied;
  
  Scanner sc= new Scanner(System.in);
  
public CreditCal(int totalExpenses)
{
	
	this.totalExpenses = totalExpenses;
}

public void accept()
{
	System.out.println("Enter the account number:");
	this.accountNo=sc.nextInt();
	System.out.println("Enter Begining balance of this month:");
	this.monthBegnBal=sc.nextInt();
	System.out.println("Enter allowed credit limit:");
	this.allowedCreditLimit=sc.nextInt();
	System.out.println("Enter total expenses:");
	this.totalExpenses=sc.nextInt();
	System.out.println("Enter the charges applied:");
	this.chargesApplied=sc.nextInt();
	}

public void calNewBalance()
{
	int total=this.monthBegnBal+this.totalExpenses-chargesApplied;
	System.out.println("New Balance:"+total);
	if(total>=this.allowedCreditLimit)
		System.out.println("Credit limit Exceeded!!!");
} 
  
}
