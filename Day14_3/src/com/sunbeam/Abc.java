package com.sunbeam;
import java.util.*;

public class Abc 
{
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
}

	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("exit : 0");
			System.out.println("addition : 1");
			System.out.println("subtraction : 2");
			System.out.println("multiplication : 3");
			System.out.println("division : 4");
			System.out.println("enter choice : ");
			choice= sc.nextInt();
			
			switch(choice)
			{
			case 1:
				double num1= sc.nextDouble();
				double num2= sc.nextDouble();
				calculate(num1,num2,(s,r)-> s+r);
				break;
				
			case 2:
				double num3= sc.nextDouble();
				double num4= sc.nextDouble();
				calculate(num3,num4,(s,r)-> s-r);
				break;
				
			case 3:
				double num5= sc.nextDouble();
				double num6= sc.nextDouble();
				calculate(num5,num6,(s,r)-> s*r);
				break;
				
			case 4:
				double num7= sc.nextDouble();
				double num8= sc.nextDouble();
				calculate(num7,num8,(s,r)-> s/r);
				break;
				
				default:
					System.out.println("enter wrong choices = ");
					break;
				
			}
		}
			while(choice != 0);
		
		

}
}
