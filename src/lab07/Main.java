package lab07;

public class Main {
	public static void main(String[] args) {
		System.out.println("Run video 45 !!!");

		SinhVien it1 = new SinhVienIT("1", "Fong", 10, 0.1, "Java", 10, 7);
		System.out.printf("Sinh vien it score = %.1f \n", it1.getScore());

		SinhVien coKhi1 = new SinhVienCoKhi("1", "Eric", 10, 0.1, "CNC", 6, 9);
		System.out.printf("Sinh vien it score = %.1f \n", coKhi1.getScore());
	}
}
