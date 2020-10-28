package URI;

import java.util.Scanner;

public class URI_1515 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			Integer auxYear = null;
			String planet = null;
			for (int i = 0; i < n; i++) {
				String namePlanet = sc.next();
				int yearSend = sc.nextInt();
				int yearsWasteToSend = sc.nextInt();
				int years = yearSend - yearsWasteToSend;
				if (i == 0) {
					auxYear = years;
					planet = namePlanet;
				}
				else if (years < auxYear){
					planet = namePlanet;
					auxYear = years;
				}
			}
			
			System.out.println(planet);
			n = sc.nextInt();
		}
		
		
		sc.close();
	}
}