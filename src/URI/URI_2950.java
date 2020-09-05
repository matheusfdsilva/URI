package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2950 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double icm = (double) n / (x + y);
		System.out.printf("%.2f\n", icm);
		
		sc.close();
	}
}
