package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2159 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		
		double x = n / Math.log(n);
		double y = 1.25506 * x;
		System.out.printf("%.1f %.1f\n", x, y);
		
		sc.close();
	}
}