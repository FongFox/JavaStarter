package chapter06;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap vao username: ");
//		String username = sc.nextLine();
//		System.out.print("Nhap vao password: ");
//		String password = sc.nextLine();
//
//		if (username.equals("hoidanit") && password.length() > 6) {
//			System.out.println("valid input!");
//		}
//
//		System.out.println("Username: " + username);
//		System.out.println("Password: " + password);
//
//		sc.close();

		Student st1 = new Student("1", "hoidanit");
		Student st2 = new Student("2", "Nguyen Van A");
		Student st3 = new Student("3", "Eric Pham");
		Student st4 = new Student("4", "Tran Van Nam");
		Student st5 = new Student("5", "Nguyen Harry Pham");

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Start with Nguyen: " + arr.get(i));
			}
		}

		System.out.println(">>> check arr: " + arr);

	}
}
