package lab02;

import java.util.Scanner;

public class Excercise04 {
	public static void main(String[] args) {
//		Viết chương trình tổ chức menu:
//			System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//			System.out.println("++ ----------------------------------------- ++");
//			System.out.println("| 1. Giải phương trình bậc nhất |");
//			System.out.println("| 2. Giải phương trình bậc hai |");
//			System.out.println("| 3. Tính số tiền điện |");
//			System.out.println("| 4. Kết thúc |");
//			System.out.println("++ ------------------ ++");
//			Yêu cầu:
//			- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

		Scanner sc = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất               |");
		System.out.println("| 2. Giải phương trình bậc hai                |");
		System.out.println("| 3. Tính số tiền điện                        |");
		System.out.println("| #. Kết thúc                                 |");
		System.out.println("++ ----------------------------------------- ++");
		System.out.print("Lua chon cua ban la: ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			// Giai phuong trinh ax + b = 0 !
			Excercise01.main(args);
			break;
		case 2:
			// Giai phuong trinh ax^2 + bx + c = 0 !
			Excercise02.main(args);
			break;
		case 3:
			// Tinh tien dien !
			Excercise03.main(args);
			break;
		default:
			System.out.println(">>> Don't know; Exit Program ! <<<");
			System.exit(choice);
		}

//		int value = sc.nextInt();
		System.out.println(">>> Exiting Program !!! <<<");
		sc.close();
	}
}
