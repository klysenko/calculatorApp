package com.company.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda1 {

	public static void main(String[] args) {

	List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
		@Override
		public int compare(String a, String b) {
			return b.compareTo(a);
		}
	});

        Collections.sort(names, (String a, String b) -> { return b.compareTo(a);}
	);

        Collections.sort(names, (a, b) -> b.compareTo(a));

        Collections.sort(names, Comparator.reverseOrder());


        //System.out.println("Sorted in reverse order: " + names);

	List<String> names2 = Arrays.asList("peter", null, "anna", "mike", "xenia");
        names2.sort(Comparator.nullsLast(String::compareTo));
        //System.out.println(names2);

	List<String> names3 = Arrays.asList("a", "b");

		Optional.ofNullable(names3).ifPresent(e -> e.sort(Comparator.naturalOrder()));

        //optional
        System.out.println(names3);
}
}
