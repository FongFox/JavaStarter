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

		System.out.printf("Giai phuong trinh %.0fx^2 + %.0fx + %.0f = 0 ! \n", a, b, c);

		if (a == 0) {
			if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem !");
			} else if (b != 0 && c == 0) {
				System.out.println("Phuong trinh vo so nghiem !");
			} else {
				double x = -c / b;

				System.out.printf("Phuong trinh co nghiem x = %.2f \n", x);
			}
		} else {
			double delta = Math.pow(b, 2) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem !");
			} else if (delta == 0) {
				double x = -b / (2 * a);

				System.out.printf("Phuong trinh co nghiem kep x = %.2f \n", x);
			} else {
				double x = (-b + Math.sqrt(delta)) / (2 * a);
				double y = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.println("Phuong trinh co 2 nghiem rieng biet !");
				System.out.printf("X = %.2f \n", x);
				System.out.printf("Y = %.2f \n", y);
			}
		}

		System.out.println("Chay thanh cong !");
//		sc.close();
	}
}
