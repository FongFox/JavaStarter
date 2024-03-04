package lab04;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		System.out.println("============= Input Product Info ============");
		p1.inputProduct();
		p2.inputProduct();
		System.out.println("\n============= Output Product Info ============");
		p1.outputProduct();
		p2.outputProduct();
	}
}
