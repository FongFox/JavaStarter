package lab03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Bai 01 run !!!");

		Scanner sc = new Scanner(System.in);
		int x = 0;
		do {
			System.out.print("Nhap 1 so x = ");
			x = sc.nextInt();
		} while (x < 2);

		for (int i = 2; i < x - 1; i++) {
			if (x % i == 0) {
				System.out.printf("%d khong phai la so nguyen to! \n", x);
				System.out.println("Run complete! Exiting!!!");
				System.exit(i);
			}
		}

		System.out.printf("%d la so nguyen to! \n", x);
		System.out.println("Run complete! Exiting!!!");
		sc.close();

	}
}
