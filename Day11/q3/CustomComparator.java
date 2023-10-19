package com.sunbeam;

import java.util.Comparator;

public class CustomComparator implements Comparator<StudentMethod> {

	@Override
	public int compare(StudentMethod s1, StudentMethod s2) {
		int diff = -(s1.getCity().compareTo(s2.getCity()));
		if(diff==0)
				diff = -(Double.compare(s1.getMarks(), s2.getMarks()));
		if(diff == 0)
			diff = s1.getName().compareTo(s2.getName());
		return diff;
	}

}
