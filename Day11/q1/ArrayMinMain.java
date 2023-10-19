
package com.sunbeam;

public class ArrayMinMain {

	public static void main(String[] args) {
		ArrayMinMethod am = new ArrayMinMethod(); 
		Integer arr[] = {10,50,13,77,111};
		
		Integer i = am.arrayMinimum(arr);
		System.out.println("min = "+i);
	}

}
