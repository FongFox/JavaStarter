package hoidanit;

public class Loop {
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}

//		int i = 9;
//		while (i < 5) {
//			System.out.println(i);
//			i++;
//		}
//
//		System.out.println("====================");
//
//		int k = 9;
//		// Vong lap do..while chay toi thieu 1 lan (run at least 1 time !)
//		do {
//			System.out.println(k);
//			k++;
//		} while (k < 5);

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
//				break;
				continue;
			}
			System.out.println(i);
		}
	}
}
