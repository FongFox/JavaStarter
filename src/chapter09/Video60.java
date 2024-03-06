package chapter09;

import java.util.Scanner;

public class Video60 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.print("Nhap x = ");
//			int x = sc.nextInt();
//			System.out.println("run try");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("run catch");
//		} finally {
//			System.out.println("run finally");
//			sc.close();
//		}

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap x = ");
			int x = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
