package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SeqVsParallel {
 
	public static final int MAX = 10000000;

	public static void sortSequential() {
		List<String> values = new ArrayList<>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}

		// sequential

		long t0 = System.nanoTime();

		List<String> collect = values.stream().sorted().collect(Collectors.toList());
		//System.out.println(collect);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));
	}

	public static void sortParallel() {
		List<String> values = new ArrayList<>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}

		// parallel

		long t0 = System.nanoTime();

		List<String> collect = values.parallelStream().sorted().collect(Collectors.toList());
		//System.out.println(collect);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("parallel sort took: %d ms", millis));
	}

	public static void printSequential() {
		List<Integer> integerList = Arrays.asList(1, 2, 3,4);
		integerList.stream().forEach(e -> System.out.println(e + " " + Thread.currentThread().getName()));
	}

	public static void printParallel() {
		List<Integer> integerList = Arrays.asList(1, 2, 3,4);
		integerList.parallelStream().forEach(e -> System.out.println(e + " " + Thread.currentThread().getName()));
	}

	public static void reduceParallel() {
		List<Integer> integerList = Arrays.asList(1, 2, 3,4);
		Integer integer = integerList.parallelStream()
				.reduce((e1, e2) -> e1 + e2).get();
		Integer integer1 = integer + 5;
		System.out.println("reduced: " + integer1);
	}

	public static void main(String[] args) {
		//sortSequential();
		//sortParallel();
		//printSequential();
		//printParallel();
		reduceParallel();
	}
}
