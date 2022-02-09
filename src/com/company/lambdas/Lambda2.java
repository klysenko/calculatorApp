package com.company.lambdas;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.company.animals.Cat;

public class Lambda2 {

	public static void main(String[] args) throws Exception {

		// Predicates
		Predicate<String> predicate = (s) -> s.length() > 0;
		Predicate<Integer> integerPredicate = (e) -> e == 0;

		boolean testStringLenghtNotEmpty = predicate.test("test");// true

		Predicate<Boolean> nonNull = (o) -> o != null;

		nonNull.test(Boolean.TRUE);
		Predicate<Boolean> isNull = (o) -> o == null;

		Predicate<String> isEmpty = (o) -> o.length() == 0;
		Predicate<String> isNotEmpty = isEmpty.negate();

		// Consumers
		//Consumer<Cat> greeter = (p) -> System.out.println("Hello, " + p.getName());
		//greeter.accept(new Cat("consumerCat", 4, "lion"));
		//Consumer<String> stringConsumer = s -> System.out.println("hello" + s);
		//stringConsumer.accept("test");

		//BiConsumer<String, Integer> biConsumer = (a, b) -> System.out.println("biConsumer: " + a + "this is "+ b);
		//biConsumer.accept("one", 1);

		// Functions

		Function<String, Integer> toInteger = (s) -> Integer.valueOf(s);

		Integer resultConverted = toInteger.apply("123");// "123"
		System.out.println("resultConverted: " + resultConverted);

		// Suppliers

		Supplier<Cat> catSupplier = () -> new Cat("supplierCat", 5, "pet");
		Cat catFromSupplier = catSupplier.get();// new Cat
		//ystem.out.println("catFromSupplier" + catFromSupplier);

		//unaryOperation
		UnaryOperator<Cat> catUnaryOperator = (cat ->
												{cat.setName("catUnaryOperator");
													return cat;});

		catUnaryOperator.apply(catFromSupplier);
		//System.out.println("catFromSupplier: " + catFromSupplier);

		//binaryOperation
		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		Integer applyResult = binaryOperator.apply(20, 20);
		System.out.println("applyResult:" + applyResult);

	}
}
