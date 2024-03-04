package chapter04;

public class Student {

	// Class Attributes
	private String name;
	private int age;
	private String address;

	// Class Constructor
	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Class Methods (or class functions)
	void learnJava() {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

	// Function Overloading
	void learnJava(int a) {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

}
