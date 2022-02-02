package com.company.doors;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class DoorMain {
	public static void main(String[] args)
			throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
			InstantiationException {
		PushDoor pushDoor = new PushDoor("shape", "c", "s");
		//class info
		String nameOfPushDoor = pushDoor.getClass().getSuperclass().getName();
		System.out.println("Name of PushDoor from object created" + nameOfPushDoor);

		//second way ot get class info
		String name = Class.forName("com.company.doors.PushDoor").getName();
		System.out.println("Name of PushDoor from Class" + name);

		//modifiers
		int modifiers = pushDoor.getClass().getModifiers();
		System.out.println("Is Public? " + Modifier.isPublic(modifiers));
		System.out.println("Is Private? " + Modifier.isPrivate(modifiers));
		System.out.println("Is Protected? " + Modifier.isProtected(modifiers));

		//superClass
		Class<?> superclass = pushDoor.getClass().getSuperclass();

		//interfaces
		Class<?>[] interfaces = pushDoor.getClass().getInterfaces();

		//constructors
		Constructor<?>[] constructors = pushDoor.getClass().getConstructors();
		System.out.println(Arrays.asList(constructors));


		//fields and methods
		//invoking
		Field [] declaredFields = PushDoor.class.getDeclaredFields();
		Field [] fields = PushDoor.class.getFields();

		System.out.println("declaredFields: " + Arrays.asList(declaredFields));
		System.out.println("fields: " + Arrays.asList(fields));

		Class<?> pushDoorClass = Class.forName("com.company.doors.PushDoor");

		PushDoor o = (PushDoor) pushDoorClass.getConstructor(String.class, String.class, String.class).newInstance("a", "b", "c");

		System.out.println("Before: " + o);


		Field declaredField = pushDoorClass.getDeclaredField("size");
		declaredField.setAccessible(true);

		declaredField.set(o, "d");
		Object o1 = declaredField.get(o);

		System.out.println("Field: " + o1.toString());

		Method[] declaredMethods = pushDoorClass.getDeclaredMethods();
		System.out.println("declaredMethods: " + Arrays.asList(declaredMethods));
		Method openDoor = pushDoorClass.getDeclaredMethod("openDoor");
		openDoor.setAccessible(true);
		openDoor.invoke(o);
	}
}
