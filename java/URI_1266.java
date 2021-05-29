package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1266 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n != 0) {
			List<Integer> cerca = new ArrayList<>();			
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt();
				cerca.add(s);
			}							
			
			cerca.add(cerca.get(0));	
			int madeirasA = checkCerca(cerca);
			cerca.remove(cerca.size()-1);
			cerca.add(0, cerca.get(cerca.size()-1));
			int madeirasB = checkCerca(cerca);

			if (madeirasA < madeirasB) {
				System.out.println(madeirasA);
			}
			else {
				System.out.println(madeirasB);
			}			

			n = sc.nextInt();
		}

		sc.close();
	}

	private static int checkCerca(List<Integer> cerca) {
		int dist = 0;
		int madeiras = 0;
		for (int i = 0; i < cerca.size(); i++) {
			if (cerca.get(i) == 0) {
				dist += 2;
			} 
			else {				
				madeiras += dist / 4;				
				dist = 0;
			}				
		}	
		
		madeiras += dist / 4;		
		return madeiras;
	}
}