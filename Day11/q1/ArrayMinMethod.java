package com.sunbeam;
//Write a generic static method to ﬁnd minimum from an array of "Number".
public class ArrayMinMethod {
		public <T extends Number>T arrayMinimum(T[] arr) {
			T min=arr[0];
			
			for(int i=1; i<arr.length; i++) {
				if(min.doubleValue() > arr[i].doubleValue()) 
					min = arr[i];
			}		
//			System.out.println("minimum value = "+min);
			
			return min;
		}
}
