package URI;

import java.util.Scanner;

public class URI_1029 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		int n = sc.nextInt();
		int[] fibonaci = createFib();
		
		for (int i = 0; i < n; i++) {
			int fib = sc.nextInt();
			
			int calls = fibonaci[fib] * 2 + fibonaci[fib-1] * 2 - 2;
			System.out.printf("fib(%d) = %d calls = %d%n", fib, calls, fibonaci[fib]);
		}	
				
		sc.close();
	}
	
	static int[] createFib() {
		int[]fibonaci = new int[40];
		fibonaci[0] = 0;
		fibonaci[1] = 1;
		
		for (int i = 2; i < 40; i++) {
			fibonaci[i] = fibonaci[i-1] + fibonaci[i-2];
		}
		return fibonaci;
	}
}
