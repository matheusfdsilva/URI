package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_3058 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double minPrice = 0;
		
		for (int i = 0; i < n; i++) {
			double price = sc.nextDouble();
			int weight = sc.nextInt();			
						
			double pricePerKg = price1000gr(price, weight);
			if (i == 0) minPrice = pricePerKg;
			if (pricePerKg < minPrice) {				
				minPrice = pricePerKg;				
			}
		}
		
		System.out.printf("%.2f%n", minPrice);
		
		sc.close();
	}

	private static double price1000gr(double price, int weight) {		
		return (double) 1000 / weight * price;		
	}	
}
