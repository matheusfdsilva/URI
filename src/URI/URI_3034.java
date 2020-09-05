package URI;

import java.util.Scanner;

public class URI_3034 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt() + 1;
			if (num % 7 == 0 && num % 2 != 0 && isPrimo(num+2)) {
				System.out.println("Yes");
			}
			else System.out.println("No");
		}
		
		sc.close();
	}

	private static boolean isPrimo(int num) {
		int totDiv = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) totDiv++;
		}
		if (totDiv != 2) return false;
		return true;
	}
}