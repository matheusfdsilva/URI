package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2630 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			List<Integer> componentes = new ArrayList<>();
			int caso = 0;
			String conversao = sc.next();
			
			for (int x = 0; x < 3; x++) {
				componentes.add(sc.nextInt());
			}
			
			if (conversao.equals("min")) caso = Collections.min(componentes);
			else if (conversao.equals("max")) caso = Collections.max(componentes);
			else if (conversao.equals("mean")) {
				for (Integer in : componentes) {
					caso += in;
				}
				caso /= 3;
			}
			else {		
				caso += componentes.get(0) * 0.3 + componentes.get(1) * 0.59 + componentes.get(2) * 0.11;
			}
			
			System.out.println("Caso #" + i + ": " + caso);
		}		
		
		sc.close();
	}
}
