package hoidanit;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {

//		- dưới 10M: không đóng thuế
//		- từ 10M tới 15M: thuế 10%
//		- từ 15 tới 30M : thuế 20%
//		- trên 30M: thuế 50%

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thue = ");
		int tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("Khong dong thue !");
		} else if (tax >= 10 && tax <= 15) {
			System.out.println("Thue 10% !");
		} else if (tax >= 15 && tax <= 30) {
			System.out.println("Thue 20% !");
		} else {
			System.out.println("Thue 50% !");
		}

		scanner.close();

	}
}
