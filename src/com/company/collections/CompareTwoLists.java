package com.company.collections;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CompareTwoLists {

	public static void compare2Lists() {

		List<Double> arrayList = new ArrayList<>();

		List<Double> linkedList = new LinkedList<>();

		final int listSize = 1000000;

		for (int i = 0; i < listSize; i++) {
			arrayList.add(Math.random());

			linkedList.add(Math.random());
		}

		long startTime = System.currentTimeMillis();

		//SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("hh:mm:ss");
		//Date date = new Date(startTime);
		//System.out.println("start time is: " + dateTimeFormatter.format(date));

		final int numberOfElementsToGet = 1000;

		for (int i = 0; i < numberOfElementsToGet; i++) {
			arrayList.get((int) (Math.random() * (listSize - 1)));
		}

		System.out.println("get elements from array in " + (System.currentTimeMillis() - startTime) + " milis");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfElementsToGet; i++) {
			linkedList.get((int) (Math.random() * (listSize - 1)));
		}
		System.out.println("get elements from linkedList in " + (System.currentTimeMillis() - startTime) + " milis");
	}
}
