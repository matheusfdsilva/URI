package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1973 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		int[] farms = new int[n];		
		long totSheeps = 0L;
		
		for (int i = 0; i < n; i++) {
			farms[i] = sc.nextInt();
			totSheeps += farms[i];
		}
				
		noStolenSheeps(farms, totSheeps);
		
		sc.close();

	}
	static void noStolenSheeps(int[] farms, long totSheeps) {
		Set<Integer> attacked = new HashSet<>();
		long stolenSheeps = 0L;
				
		for (int i = 0; i < farms.length; i++) {			
			attacked.add(i);
			
			if (farms[i] % 2 != 0) {
				if (farms[i] >= 1) {
					stolenSheeps++;
					farms[i] -= 1;
				}								
			}
			else {
				if (farms[i] >= 1) {
					stolenSheeps++;
					farms[i] -= 1;					
				}
				i -= 2;	
			}
			if (i < -1) break;
		}
			
		System.out.println(attacked.size() + " " + (totSheeps - stolenSheeps));
	}
}
