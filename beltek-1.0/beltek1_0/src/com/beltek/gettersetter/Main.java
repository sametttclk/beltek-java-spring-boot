package com.beltek.gettersetter;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Samet");
		student.setSurname("Çolak");
		student.setAge(23);
		System.out.println("Adı :" + student.getName() +
						   "  Soyadı :" + student.getSurname() +
						   " Yaşı :" + student.getAge());
	}
}

