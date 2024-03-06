package lab09;

import java.util.Scanner;

public class SinhVien {
	private String id;
	private String fullName;
	private double score;
	private int age;

	public SinhVien(String id, String fullName, double score, int age) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.score = score;
		this.age = age;
	}

	public SinhVien() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", fullName=" + fullName + ", score=" + score + ", age=" + age + "]";
	}

	public void input() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap mssv: ");
			this.id = sc.nextLine();
			System.out.println("Nhap ho ten: ");
			this.fullName = sc.nextLine();
			while (true) {
				try {
					System.out.println("Nhap diem: ");
					double tempScore = sc.nextDouble();
					if (tempScore < 0 || tempScore > 10) {
						System.out.println("Diem la so thuc!");
						continue;
					} else {
						score = tempScore;
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Run Error!");
				}
			}
			while (true) {
				try {
					System.out.println("Nhap tuoi: ");
					int tempAge = sc.nextInt();
					if (tempAge < 18 || tempAge > 100) {
						System.out.println("Tuoi la so nguyen!");
						continue;
					} else {
						age = tempAge;
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Run Error!");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Run error Exit Program!");
		}
	}
}
