package lab01;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input edge: ");
		double edge = sc.nextDouble();
		
		double v = Math.pow(edge, 3);
		
		System.out.println("V = " + v);
		
		sc.close();
	}
}
