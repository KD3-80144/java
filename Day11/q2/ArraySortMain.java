package com.sunbeam;

import java.util.Comparator;

public class ArraySortMain {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {		
		Double arr[] = {50.50,10.10,60.60,70.70,40.40};
		
		CustomComparator cc = new CustomComparator(); 
		ArraySortMain.selectionSort(arr, cc);
		
		for(Double ele:arr) {
			System.out.println(ele);
		}
	}
}
