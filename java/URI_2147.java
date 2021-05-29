package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2147 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String galopeira = sc.next();		
			double t = galopeira.length() / 100.0;
			System.out.printf("%.2f\n", t);
		}		
		
		sc.close();
	}
}
