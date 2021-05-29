package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1252 {

	public static int div;
	
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n + " " + m);
		
		while (n != 0 && m != 0) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int numero = sc.nextInt();
				list.add(numero);
			}
			div = m;
			
			list.sort((x, y) -> {						
				int modx = x % div;
				int mody = y % div;					
				if (modx == mody) {
					if ((x % 2 != 0 && y % 2 == 0) || (x % 2 == 0 && y % 2 != 0)) {		
						if (x % 2 != 0) {
							return - 1;
						}
						else {
							return 1;
						}						
					}
					if (x % 2 != 0 && y % 2 != 0) {
						return -x.compareTo(y);
					}					
					return x.compareTo(y);
				}						
				x = modx; y = mody;				
				return x.compareTo(y);
			});
						
			list.forEach(System.out::println);
			
			n = sc.nextInt();
			m = sc.nextInt();
			System.out.println(n + " " + m);
		}
		
		sc.close();
	}
}