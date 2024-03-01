package hoidanit;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		System.out.println("Running Lab 02!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input hight: ");
		double hight = sc.nextDouble();
		System.out.println("Input width: ");
		double width = sc.nextDouble();
		
		double p = (hight + width) * 2;
		double s = hight * width;
		
		System.out.println("P = " + p);
		System.out.println("S = " + s);
		System.out.println("Min edge: " + Math.min(hight, width));
	}
}
