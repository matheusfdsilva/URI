package URI;

import java.util.Scanner;

public class URI_1028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int numerador = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println(mdc(numerador, divisor));
					
		}		
		sc.close();

	}
	public static int mdc(int n, int d) {
		if (n % d == 0) return d;
		else return mdc(d, n % d);
	}
}
