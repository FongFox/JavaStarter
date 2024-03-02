package lab02;

import java.util.Scanner;

public class Excercise02 {
	public static void main(String[] args) {
//		Cho phương trình: ax^2 + bx + c = 0
//				Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//				trên
//				Gợi ý:
//				- Nếu a = 0 => làm tương tự ví dụ bài 1
//				- Nếu a # 0:
//				- Tính delta = b^2 - 4ac.
//				- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//				- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//				- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//				x1 = (-b + căn(delta))/(2*a)
//				x2 = (-b - căn(delta))/(2*a)

		System.out.println("Chuong trinh tinh nghiem phuong trinh ax^2 + bx + c = 0 !");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a = ");
		double a = sc.nextDouble();
		System.out.print("Nhap b = ");
		double b = sc.nextDouble();
		System.out.print("Nhap c = ");
		double c = sc.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem !");
			} else {
				System.out.println("Phuong trinh vo nghiem !");
			}
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem !");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep x = " + (-b / (2 * a)));
			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng biet !");
				System.out.println("X (1) = " + ((-b + Math.sqrt(delta)) / (2 * a)) * 1.00);
				System.out.println("X (2) = " + ((-b - Math.sqrt(delta)) / (2 * a)) * 1.00);
			}
		}

		System.out.println("Chay thanh cong !");
//		sc.close();
	}
}
