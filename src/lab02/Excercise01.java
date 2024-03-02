package lab02;

import java.util.Scanner;

public class Excercise01 {
	public static void main(String[] args) {
//		Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//		trên
//		Gợi ý:
//		- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//		- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//		- Còn lại: x = -b/a => thông báo x = ?

		System.out.println("Chuong trinh tinh nghiem phuong trinh ax + b = 0 !");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a = ");
		double a = sc.nextDouble();
		System.out.print("Nhap b = ");
		double b = sc.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem !");
			} else {
				System.out.println("Phuong trinh vo nghiem !");
			}
		} else {
			System.out.println("X = " + (-(b / a) * 1.00));
		}

		System.out.println("Chay thanh cong !");
//		sc.close();
	}
}
