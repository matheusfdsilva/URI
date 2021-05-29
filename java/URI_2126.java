package URI;

import java.util.Scanner;

public class URI_2126 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caso = 1;		
		
		while (sc.hasNext()) {			
			String x = sc.next();
			String y = sc.next();			
			System.out.println("Caso #" + caso + ":");
			int subs = 0;
			int pos = - 1;
			if (y.contains(x)) {
				while (true) {
					pos = y.indexOf(x, pos + 1);
					if (pos < 0) break;
					subs++;
				}				
				System.out.println("Qtd.Subsequencias: " + subs);
				System.out.println("Pos: " + (y.lastIndexOf(x) + 1));
			}
			else System.out.println("Nao existe subsequencia");
			System.out.println();
			
			caso++;
		}
		sc.close();

	}
}
