package com.company.generics;

public class UaTax implements TaxCalculator{

	@Override
	public double getTax(double sum) {
		return sum * 0.12;
	}
}
