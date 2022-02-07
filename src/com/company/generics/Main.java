package com.company.generics;

import java.lang.reflect.Proxy;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//proxy
		TaxCalculator proxyCalculator =
				(TaxCalculator) Proxy.newProxyInstance(
						TaxCalculator.class.getClassLoader(),
						new Class[]{TaxCalculator.class},
						new TaxInvocationHandler(new UaTax())
				);


		double sum = 60000;

		//UaTax uaTax = new UaTax();
		UsaTax usaTax = new UsaTax();

			if (sum < 100000) {
				System.out.println("UA tax = " + proxyCalculator.getTax(sum));
			} else {
				System.out.println("USA tax = " + usaTax.getTax(sum));
			}



	}


}
