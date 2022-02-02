package com.company.generics;

public class GenericClass<T extends Number> {
	T ob;

	GenericClass(T o) {
			ob = o;
		}

	T getObject() {
			return ob;
		}

	void showType() {
			System.out.println("Type T: " + ob.getClass().getName());
		}
}
