package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2600 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>();
			
			for (int k = 0; k < 6; k++) {
				int num = sc.nextInt();
				if (!list.contains(num)) {
					list.add(num);
				}
			}
						
			list.removeIf(x -> x > 6);
			
			if (list.size() == 6 && isClassic(list)) {
				System.out.println("SIM");
			}
			else {
				System.out.println("NAO");
			}				
		}
		
		sc.close();
	}	

	private static boolean isClassic(List<Integer> list) {
		return list.get(0) + list.get(5) == 7 && list.get(1) + list.get(3) == 7 && list.get(2) + list.get(4) == 7;			
	}
}