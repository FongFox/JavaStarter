package chapter04;

public class Student {

	// Class Attributes
	private String name;
	private int age;

	// Class Constructor
	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Class Methods (or class functions)
	void learnJava() {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

	// Function Overloading
	void learnJava(int a) {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

	String getAge() {
		return "Hoi dan IT";
	}
}
