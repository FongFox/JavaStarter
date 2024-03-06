package chapter09;

import java.util.Scanner;

public class Video59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap x = ");
			try {
				int x = sc.nextInt();
				try {
					System.out.println("Ket qua 10/x = " + 10 / x);
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Run error with x = " + x);
				}
			} catch (Exception e) {
				// TODO: handle exception
				sc.next();
				System.out.println("Run error !!!");
				continue;
			}

		}

	}
}
