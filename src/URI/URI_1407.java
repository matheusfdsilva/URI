package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1407 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer>list = new ArrayList<>();
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();		
		
		while (n != 0 && c != 0 && k != 0) {					
			
			for (int i = 1; i <= k; i++) {
				list.add(i);
			}			
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < c; j++) {
					list.add(sc.nextInt());										
				}
			}
					
			long[]vect = new long[k];
			long smallFreq = 0L;
								
			for (int i = 0; i < k; i++) {				
				int temp = i + 1;
				long quantity = list.stream().filter(x -> x == temp).count();
				vect[i] = quantity;
				if (i == 0) {
					smallFreq = quantity;
				}
				if (quantity < smallFreq) {
					smallFreq = quantity;
				}
			}			
			
			String result = "";
			for (int i = 0; i < k; i++) {
				if (vect[i] == smallFreq) {
					result += (i+1) + " ";
				}
			}
			
			System.out.println(result.trim());
			list.clear();
			
			n = sc.nextInt();
			c = sc.nextInt();
			k = sc.nextInt();
						
		}		
		
		sc.close();
	}
}