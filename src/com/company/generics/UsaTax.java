package com.company.generics;

public class UsaTax implements TaxCalculator{

	@Override
	public double getTax(double sum) {
		return sum * 0.2;
	}
}
