package hoidanit;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		System.out.println("Run lab 01!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name: ");
		String name = sc.nextLine();
		System.out.println("Input your score: ");
		double score = sc.nextDouble();
		
		System.out.println(name + " co diem = " + score * 1.0);
		System.out.println("Name: " + name);
		System.out.println("Score: " + score * 1.0);
		
		sc.close();
	}
}
