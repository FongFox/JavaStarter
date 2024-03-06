package lab08;

public class Main {
	public static void main(String[] args) {
		System.out.println("Run lab 08 !!!");
		Student st1 = new Student("1", "Fong", 20, 4);
		Student st2 = new Student("2", "Eric", 22, 7);
		st1.setGrade();
		st2.setGrade();

		System.out.println("Check st1 Grade = " + st1.getGrade());
//		System.out.println("Check st1" + st1.toString());
		System.out.println("Check st2 Grade = " + st2.getGrade());
	}
}
