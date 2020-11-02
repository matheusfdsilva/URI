package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_3145 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		double days = x / ((n + 2) * 1.0);
		
		System.out.printf("%.2f\n", days);		
		
		sc.close();
	}
}