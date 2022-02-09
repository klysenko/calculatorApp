package com.company.lambdas;

import static java.lang.Math.sqrt;

public class FunctionalIntefrace {

	public static final int INT = 100;

	@FunctionalInterface
	interface Formula {
		double calculate(int a);

		default double sqrt(int a) {
			return Math.sqrt(positive(a));
		}

		static int positive(int a) {
			return a > 0 ? a : 0;
		}
	}

	public static void main(String[] args) {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};

		double result = formula.calculate(100);// 100.0
		formula.sqrt(-23);          // 0.0
		Formula.positive(-4);        // 0.0

		System.out.println("result from f interface" + result);
		//do with lambda
		Formula formulaWithLambda = (a) -> sqrt(a * INT);
		double resultFromLambda = formulaWithLambda.calculate(100);

		System.out.println("result from lambda" + resultFromLambda);

	}
}
