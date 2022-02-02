package com.company.collections;

import java.util.Comparator;

import com.company.Plane;

public class WingsComparator implements Comparator<Plane> {
	@Override
	public int compare(Plane o1, Plane o2) {
		return (o1.getWings() - o2.getWings());
	}

	@Override
	public String toString() {
		return "WingsComparator{}";
	}
}
