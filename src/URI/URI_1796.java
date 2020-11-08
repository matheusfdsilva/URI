package URI;

import java.util.Scanner;

public class URI_1796 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int afavor = 0;
		
		for (int i = 0; i < n; i++) {
			int op = sc.nextInt();
			if (op == 0) {
				afavor++;
			}
		}
		
		System.out.println(afavor > n / 2 ? "Y" : "N");		
		
		sc.close();
	}
}