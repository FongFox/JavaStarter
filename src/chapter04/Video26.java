package chapter04;

public class Video26 {
	public static void main(String[] args) {
		System.out.println("Run video 26!");

		Student st1 = new Student(); // constructor
		Student st2 = new Student("Eric", 26);

		System.out.println("Check Obj: " + st2.name + " and age = " + st2.age);
	}
}
