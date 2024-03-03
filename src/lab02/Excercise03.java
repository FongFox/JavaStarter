package lab02;

import java.util.Scanner;

public class Excercise03 {
	public static void main(String[] args) {
//		Viết chương trình tính số tiền điện (in kết quả ra console)
//		Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//		- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//		- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
//		Gợi ý:
//			- Nếu số điện <= 100 => số tiền = số điện x 1000
//			- Nếu số điện > 100
//			=> số tiền = 100 * 1000 + (số điện - 100) * 1500

		Scanner sc = new Scanner(System.in);
		System.out.println("Chuong trinh tinh tien dien !");
		System.out.print("Nhap tien dien: ");
		int electricalMoney = sc.nextInt();

		if (electricalMoney <= 100) {
			int totalMoney = electricalMoney * 1000;
			System.out.println("Tien dien phai tra: " + totalMoney + " VND");
		} else if (electricalMoney > 100) {
			int totalMoney = (100 * 1000) + ((electricalMoney - 100) * 1500);
			System.out.println("Tien dien phai tra: " + totalMoney + " VND");
		}

		System.out.println("Chay thanh cong !");
//		sc.close();
	}
}
