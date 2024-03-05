package chapter05;

import java.util.ArrayList;

import chapter04.Student;

public class Video33 {
	public static void main(String[] args) {
		System.out.println("Run video 33 !!!");

		ArrayList a2 = new ArrayList();

		ArrayList<String> a1 = new ArrayList<String>(); // primitive data type; Generic
		ArrayList<Student> a3 = new ArrayList<Student>();

//		a1.add(2); // integer (primitive) => Integer (non-primitive)
		a1.add("Hoi dan IT");
		a1.add("Hoi dan IT2");
		a1.add("Hoi dan IT3");

		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.get(1));
	}
}
