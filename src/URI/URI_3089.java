package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_3089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		
		while (n != 0) {
			
			List<Integer> presents = new ArrayList<>();
			for (int i = 0; i < n * 2; i++) {
				presents.add(sc.nextInt());
			}				
										
			System.out.println(mostExpensiveAndCheaper(presents));	
			
			n = sc.nextInt();			
		}
				
		sc.close();
	}
	
	static String mostExpensiveAndCheaper(List<Integer> presents) {
		int sum = 0;
		int mostExpensive = 0;
		int cheaper = 0;
		
		if (presents.size() == 2) {
			sum = presents.get(0) + presents.get(1);
			mostExpensive = sum;
			cheaper = sum;
		}
		else {				
			mostExpensive = presents.get(0) + presents.get(presents.size() - 1);
			cheaper = mostExpensive;
			presents.remove(0);
			presents.remove(presents.size() - 1);
			
			while (presents.size() > 0) {
				sum = presents.get(0) + presents.get(presents.size() - 1);
				presents.remove(0);
				presents.remove(presents.size() - 1);
				
				if (sum > mostExpensive) {
					mostExpensive = sum;
				}
				if (sum < cheaper) {
					cheaper = sum;
				}
			}				
		}
		String mostExpensiveSt = String.valueOf(mostExpensive);
		String cheaperSt = String.valueOf(cheaper);
		
		return mostExpensiveSt + " " + cheaperSt;
	}
}
