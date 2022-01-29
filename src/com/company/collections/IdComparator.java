package com.company.collections;

import java.util.Comparator;

import com.company.Plane;

public class IdComparator implements Comparator<Plane> {
	@Override
	public int compare(Plane o1, Plane o2) {
		return o1.getId() - o2.getId();
	}
}
