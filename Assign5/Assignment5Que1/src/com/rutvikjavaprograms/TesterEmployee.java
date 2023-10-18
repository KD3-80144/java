package com.rutvikjavaprograms;

public class TesterEmployee 
{

	public static void main(String[] args) 
	{
		Employees emp=new BaseSalariedCommissionEmployee();
		emp.accept();
		emp.display();
		emp.calTotSal();
	}

}
