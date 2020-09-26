package URI;

import java.util.Scanner;

public class URI_1310 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		while (sc.hasNext()) {			
			int n = sc.nextInt();
			int[] gainPerDay = new int[n];
			int costPerDay = sc.nextInt();			
			for (int i = 0; i < n; i++) {
				int gain = sc.nextInt();
				gainPerDay[i] = gain;
			}
			
			System.out.println(maxProfit(gainPerDay, costPerDay));					
		}
		
		sc.close();
	}

	private static int maxProfit(int[] gainPerDay, int costPerDay) {
		int maxProfit = 0;		
		for (int i = 0; i < gainPerDay.length; i++) {
			int profit = 0;
			for (int k = i; k < gainPerDay.length; k++) {
				profit += gainPerDay[k] - costPerDay;
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}
}