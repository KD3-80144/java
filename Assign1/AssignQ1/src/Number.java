

import java.util.Scanner;
public class Number
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter num=");
	 int num1=sc.nextInt();
	 System.out.println("Number="+num1);
	 System.out.println("Number to binary="+Integer.toBinaryString(num1));
	 System.out.println("Number to binary="+Integer.toHexString(num1));
	 System.out.println("Number to binary="+Integer.toOctalString(num1));
	}
}