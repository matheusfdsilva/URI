package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1217 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double fullWeight = 0;
		double fullWaste = 0;
		
		for (int i = 1; i <= n; i++) {
			double wastePerDay = sc.nextDouble();
			sc.nextLine();		
			
			String[] fruits = sc.nextLine().split(" ");
			fullWeight += fruits.length;
			fullWaste += wastePerDay;
			
			System.out.println("day " + i + ": " + fruits.length + " kg");			
		}
		
		double avgWeight = fullWeight / n;
		System.out.printf("%.2f kg by day\n", avgWeight);
		
		double avgWaste = fullWaste / n;
		System.out.printf("R$ %.2f by day\n", avgWaste);
		
		sc.close();
	}
}
