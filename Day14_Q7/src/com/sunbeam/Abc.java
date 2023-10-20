package com.sunbeam;
import java.util.*;
import java.util.stream.Stream;

public class Abc {

	public static void main(String[] args) 
	{
		Random r = new Random();
		Stream<Integer> s = Stream.generate(()->r.nextInt(10)).limit(10);
		int result = s.reduce(0, (a,e)->a+e);
		System.out.println("RESULT = " +result);
	}

}
