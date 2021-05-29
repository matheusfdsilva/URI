package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2925 {

	private static List<Long> iccanobif = new ArrayList<>();	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		iccanobif.add(0L);
		iccanobif.add(1L);
		iccanobif.add(2L);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();	
			long sum = 0L;
			if (n > 2) {
				addElements(n);
				sum = iccanobif.get(n-1) + iccanobif.get(n-2);
			}
			else {
				sum = iccanobif.get(n);
			}
			 
			System.out.println(sum);				
		}
		
		sc.close();
	}
	
	private static void addElements(int n) {		
		for (int i = iccanobif.size()-1; i < n; i++) {
			long number = iccanobif.get(i) + iccanobif.get(i-1);
			if (i >= 5) {
				StringBuilder sb = new StringBuilder(String.valueOf(number));
				sb.reverse();
				number = Long.parseLong(sb.toString());
			}
			iccanobif.add(number);
		}		
	}
}