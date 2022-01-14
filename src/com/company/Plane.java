package com.company;

public class Plane {

		private int id;
		private int capacity;
		private int wings;
		private String name;
		private String engine;
		private String type;

	public Plane(int id, int capacity, int wings, String name, String engine, String type) {
		this.id = id;
		this.capacity = capacity;
		this.wings = wings;
		this.name = name;
		this.engine = engine;
		this.type = type;
	}

	public Plane(int id) {
		this.id = id;
	}

	public void move(int distanceKm) {
			System.out.println("I am moving" + distanceKm);
		}

		@Override
	public String toString() {
		return "Plane{" +
				"id=" + id +
				", capacity=" + capacity +
				", type='" + type + '\'' +
				'}';
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getWings() {
		return wings;
	}

	public String getName() {
		return name;
	}

	public String getEngine() {
		return engine;
	}

	public String getType() {
		return type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Plane plane = (Plane) o;

		if (id != plane.id) {
			return false;
		}
		if (capacity != plane.capacity) {
			return false;
		}
		if (wings != plane.wings) {
			return false;
		}
		if (!name.equals(plane.name)) {
			return false;
		}
		if (!engine.equals(plane.engine)) {
			return false;
		}
		return type.equals(plane.type);
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + capacity;
		result = 31 * result + wings;
		result = 31 * result + name.hashCode();
		result = 31 * result + engine.hashCode();
		result = 31 * result + type.hashCode();
		return result;
	}
}
