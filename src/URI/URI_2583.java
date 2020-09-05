package URI;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class URI_2583 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			Set<String> coisas = new TreeSet<>();
			
			for (int l = 0; l < x; l++) {
				String a = sc.next();
				String b = sc.next();
				if (b.equals("chirrin")) coisas.add(a);
				if (b.equals("chirrion")) {
					if (coisas.contains(a)) coisas.remove(a);
				}								
			}
			System.out.println("TOTAL");
			for (String obj : coisas) {
				System.out.println(obj);
			}
		}		
		
		sc.close();
	}
}
