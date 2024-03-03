package chapter04;

public class Video23 {

//	public static void main(String[] args) {
//		System.out.println("Run video 23!");
//
//		Student st1 = new Student(); // khai bao 1 Object & gan gia tri
//		st1.name = "Eric";
//		st1.age = 25;
//
//		Student st2 = new Student(); // khai bao 1 Object & gan gia tri
//		st1.name = "Hoi dan IT";
//		st1.age = 20;
//
//		System.out.println("Student with name = " + st1.name + " and age = " + st1.age);
//	}

	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Video23 test = new Video23();
		int sum = test.sum(6, 9);
		System.out.println("Sum = " + sum);
	}
}
