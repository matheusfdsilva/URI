package URI;

import java.util.Scanner;

public class URI_1161 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			long somaM = 1, somaN = 1;
			
			for (int i = m; i > 0; i--) {
				somaM *= i;
			}
			for (int i = n; i > 0; i--) {
				somaN *= i;
			}
			long soma = somaM + somaN;
			System.out.println(soma);
		}		
		
		sc.close();
	}
}
