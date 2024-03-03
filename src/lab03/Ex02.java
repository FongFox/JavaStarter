package lab03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Bai 02 run!!!");
		Scanner sc = new Scanner(System.in);
		int number = 0;
		do {
			System.out.print("Nhap so nguyen bat ky phai lon hon 0: ");
			number = sc.nextInt();
		} while (number <= 0);

		System.out.printf("Bang cuu chuong cua so %d \n", number);
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d \n", number, i, number * i);
		}

		System.out.println("Run complete!!! Exiting!");
		sc.close();
	}
}
