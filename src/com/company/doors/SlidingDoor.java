package com.company.doors;

public class SlidingDoor extends Door{

	public SlidingDoor(String shape, String color) {
		super(shape, color);
	}

	@Override
	public void openDoor() {
		System.out.println("Open sliding door");
	}

	@Override
	public void closeDoor() {
		System.out.println("Close sliding door");
	}
}
