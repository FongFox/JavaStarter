package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("Bai 03 run!");
		Scanner sc = new Scanner(System.in);

		int size;
		do {
			System.out.print("Nhap so luong phan tu yeu cau cua mang (phai lon hon 1 phan tu): ");
			size = sc.nextInt();
		} while (size <= 1);

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap phan tu thu %d: ", i + 1);
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Before Sort: " + Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("Array Sort Result: " + Arrays.toString(arr));

//		Step 1:
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

//		Step 2:
//		int max = arr[0];
//		int min = arr[0];
//		for (int i = 1; i < size; i++) {
//			max = max < arr[i] ? (max = arr[i]) : max;
//			min = min > arr[i] ? (min = arr[i]) : min;
//		}

		System.out.println("Max = " + max);
		System.out.println("Min = " + min);

		System.out.println("Run complete! Exiting!");
		sc.close();
	}
}
