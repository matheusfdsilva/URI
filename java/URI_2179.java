package URI;

import java.util.Scanner;

public class URI_2179 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int weightPerTravel = 0;
			int travels = 0;
			for (int j = 0; j < n; j++) {
				int weightPresent = sc.nextInt();
				if (weightPerTravel + weightPresent <= m) {
					weightPerTravel += weightPresent;
				}
				else {
					travels++;
					weightPerTravel = weightPresent;
				}
			}
			if (weightPerTravel != 0) {
				travels++;
			}
			System.out.println(travels);	
		}	
		
		sc.close();
	}
}