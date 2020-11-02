package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_3146 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double circu = 2 * 3.14 * r;
		System.out.printf("%.2f\n", circu);
		
		sc.close();
	}
}