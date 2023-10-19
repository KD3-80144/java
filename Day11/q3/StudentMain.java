package com.sunbeam;

import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentMethod[] studArr = new StudentMethod[5];
		studArr[0]= new StudentMethod (10,"ra","la",50);
		studArr[1]= new StudentMethod (20,"cv","ml",60);
		studArr[2]= new StudentMethod (40,"ok","ml",70);
		studArr[3]= new StudentMethod (80,"bv","la",70);
		studArr[4]= new StudentMethod (70,"ra","as",50);
		
		System.out.println("-----------------before sorting array--------------------");
		for(StudentMethod sm:studArr) {
			System.out.println(sm);
		}
		
		System.out.println("-------------------sorted array-----------------------");
		Arrays.sort(studArr, new CustomComparator());
		for(StudentMethod sm:studArr) {
			System.out.println(sm);
		}
		
	}

}
