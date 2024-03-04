package lab04;

import java.util.Scanner;

public class Product {
	// Attribute
	private String name;
	private double price;
	private double tax;

	// Constructors
	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// Getter & Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getTax() {
		return tax;
	}

	// Return Tax Price
	public double getTaxPrice() {
		return price * tax;
	}

	// Method
	public void inputProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">>> Nhap Thong Tin San Pham <<<");

		System.out.print("Nhap ten san pham: ");
		name = sc.nextLine();
		System.out.print("Nhap gia san pham: ");
		price = sc.nextDouble();
		System.out.print("Nhap thue san pham: ");
		tax = sc.nextDouble();

//		sc.close();
	}

	public void outputProduct() {
		System.out.println(">>> Xuat Thong Tin San Pham <<<");
		System.out.println("Ten san pham: " + name);
		System.out.println("Gia san pham: " + price);
		System.out.println("Thue san pham: " + tax);
		System.out.println("Tien thue san pham: " + getTaxPrice());
	}

}
