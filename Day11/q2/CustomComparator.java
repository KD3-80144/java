package com.sunbeam;

import java.util.Comparator;

public class CustomComparator implements Comparator<Double>{

	@Override
	public int compare(Double arg0, Double arg1) {
		int diff = Double.compare(arg0, arg1);
		return diff;
	}
}
