package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2516 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int d = sc.nextInt();
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			if (v1 == v2 || v1 < v2) {
				System.out.println("impossivel");
			}
			else {
				double s = d / ((v1 - v2) * 1.0);
				System.out.printf("%.2f\n", s);
			}
		}		
		
		sc.close();
	}
}