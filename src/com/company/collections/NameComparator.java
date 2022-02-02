package com.company.collections;

import java.util.Comparator;

import com.company.Plane;

public class NameComparator implements Comparator<Plane> {
	@Override
	public int compare(Plane o1, Plane o2) {
		Integer o1Length = o1.getName().length();
		Integer o2Length = o2.getName().length();
		return Integer.compare(o1Length, o2Length);
	}
}
