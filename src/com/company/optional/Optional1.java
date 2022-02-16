package com.company.optional;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		String s = null;

		Optional<String> optional = Optional.ofNullable(s);

		boolean isPresent = optional.isPresent();// true
		System.out.println(isPresent);

		String value = optional.orElse("fallback");// "optional"
		System.out.println("optional value: " + value);


		optional.ifPresent((e) -> System.out.println(e.charAt(0)));// "o"

	}
}
