package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Lab 05 run !!!");
		ArrayList<Double> listNumber = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);

		System.out.println(">>> Nhap gia tri <<<");
		while (true) {
			System.out.print("Nhap gia tri: ");
//			Double number = sc.nextDouble();
			double number = sc.nextDouble();
			listNumber.add(number);
//			sc.nextLine();

			System.out.print("Nhap tiep (Y/N)? ");
			if (sc.nextLine().equals("N") || sc.nextLine().equals("n")) {
				System.out.println(">>> Ket thuc viec nhap gia tri <<<");
				break;
			}
		}

		Double result = 0.0;
//		for (Double number : listNumber) {
//			result += number;
//		}
		for (int i = 0; i < listNumber.size(); i++) {
			result += listNumber.get(i);
		}
		System.out.printf("Tong nhung gia tri co trong mang x = %.2f \n", result.doubleValue());

		System.out.println(">>> Chay thanh cong !!! Thoat chuong trinh !!! <<<");
		sc.close();
	}
}
