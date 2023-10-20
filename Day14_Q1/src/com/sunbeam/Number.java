package com.sunbeam;
import java.util.Arrays;
//import java.util.*;
import java.util.function.Predicate;
public class Number {
	
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr)
		{
		if(cond.test(str))
		count++;
		}
		return count;
		}


	public static void main(String[] args) 
	{
			String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
			// call countIf() to count number of strings have length more than 6 -- using anonymous inner class
			
			int cont = countIf(arr,s -> s.length() >6);
			System.out.println("Result : " +cont);
			
			}
			
	}



	
