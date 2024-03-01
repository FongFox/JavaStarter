package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		int age = 22;
//		String name = "Fong";
//		System.out.println("Info: " + name + ", " + age);
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Your name is: ");
		String name = scanner.nextLine();
		System.out.println("Your age is: ");
		int age = scanner.nextInt();
		
		System.out.println("First number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Second number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("My name is " + name + ", age = " + age);
		System.out.println("Min = " + Math.pow(firstNumber, secondNumber));
		scanner.close();
		
//		int a = 6; 
//		int b = 9;
//		
//		int c = Math.min(a, b);
//		
//		System.out.println("Min: " + c);
	}
}
