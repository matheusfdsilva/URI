package URI;

import java.util.Scanner;

public class URI_1218 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casee = 1;			
		
		while (sc.hasNext()) {
			int woman = 0, man = 0, samePar = 0;
			
			if (casee > 1) System.out.println();
			
			String numeracao = sc.next();
			sc.nextLine();
			String[]calcados = sc.nextLine().split(" ");
			
			for (int i = 0; i < calcados.length; i++) {				
				if (i % 2 == 0){
					if (calcados[i].equals(numeracao)) {
						if (calcados[i+1].equals("M")) man++;
						else woman++;
						samePar++;
					}					
				}
			}
			
			System.out.println("Caso " + casee + ":");
			System.out.println("Pares Iguais: " + samePar);
			System.out.println("F: " + woman);
			System.out.println("M: " + man);			
			
			casee++;				
		}
		
		sc.close();
	}
}
