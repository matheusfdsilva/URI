package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2166 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double sqrtDois = 1.0;
		double aux = 0;
		for (int i = 0; i < n; i++) {				
			aux += 2;
			aux = 1.0/ aux;
		}
		sqrtDois += aux;
		System.out.printf("%.10f\n", sqrtDois);
		sc.close();

	}
}
