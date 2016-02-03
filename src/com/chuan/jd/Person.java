package com.chuan.jd;

import java.util.HashMap;

public class Person {

	private String id;
	public Person(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || this.getClass() != o.getClass())
			return false;

		Person person = (Person) o;

		if (id != null ? !id.equals(person.id) : person.id != null)
			return false;

		return true;
	}

	public static void main(String[] args) {

		HashMap<Person, String> map = new HashMap<Person, String>();

		map.put(new Person("001"), "findingsea");
		map.put(new Person("002"), "linyin");
		map.put(new Person("003"), "henrylin");
		map.put(new Person("003"), "findingsealy");

		System.out.println(map.toString());

		System.out.println(map.get(new Person("001")));
		System.out.println(map.get(new Person("002")));
		System.out.println(map.get(new Person("003")));
	}
}