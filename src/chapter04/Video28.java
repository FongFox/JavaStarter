package chapter04;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("Run video 28 !!!");

		Student st1 = new Student();
		Student st2 = new Student("Fong", 22);
//		st2.setName("Fong new setName !");
//		st2.setAge(18);
		System.out.println("Check Object: " + st2.getName() + " and age = " + st2.getAge());
	}
}
