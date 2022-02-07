package com.company.annotations;

import java.lang.annotation.Annotation;

public class RestrictedBox extends Box {

	@Override
	protected void addToBox(Object value) {
		Class<?> valueClass = value.getClass();
		boolean isAccessible = false;
		for (Annotation annotation : valueClass.getAnnotations()) {
			if (annotation instanceof AccessToRestrictedBox)
			{
				isAccessible = true;
			} else {
				isAccessible = false;
			}

		}
		if (isAccessible) {

		super.addToBox(value);}
		else {
			System.out.println("Access denied!");
		}

	}
}
