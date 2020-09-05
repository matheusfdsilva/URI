package URI;

import java.util.Scanner;

public class URI_2596 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			System.out.println(esferas(x));
		}		
		
		sc.close();	
	}
	
	static int esferas(int x) {
		int count = 0;		
		int n = 1;
		
		while (n <= x) {
			int countDiv = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) countDiv++;
			}
			if (countDiv % 2 == 0) count++;
			n++;
		}
		return count;
	}
}
