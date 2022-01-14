package com.company.doors;

public class PushDoor extends Door{
	public PushDoor(String shape, String color) {
		super(shape, color);
	}

	@Override
	public void openDoor() {
		System.out.println("Open push door");
	}

	@Override
	public void closeDoor() {
		System.out.println("Close push door");
	}
}
