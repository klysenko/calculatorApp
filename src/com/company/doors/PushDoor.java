package com.company.doors;

public class PushDoor extends Door implements Comparable<PushDoor>{
	private String size;
	public PushDoor(String shape, String color, String size) {
		super(shape, color);
		this.size = size;
	}

	@Override
	public void openDoor() {
		System.out.println("Open push door");
	}

	@Override
	public void closeDoor() {
		System.out.println("Close push door");
	}

	@Override
	public String toString() {
		return "PushDoor{" +
				"size='" + size + '\'' +
				'}';
	}

	@Override
	public int compareTo(PushDoor o) {
		return this.size.compareTo(o.size);
	}
}
