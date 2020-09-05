package URI;

import java.util.Scanner;

public class URI_1914 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String jogador1 = sc.next();
			String escolha1 = sc.next();
			String jogador2 = sc.next();
			String escolha2 = sc.next();
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if (escolha1.equals("PAR")){
				if ((n1 + n2) % 2 == 0) {
					System.out.println(jogador1);
				}
				else {
					System.out.println(jogador2);
				}
			} 
			else {
				if ((n1 + n2) % 2 == 0) {
					System.out.println(jogador2);
				} 
				else {
					System.out.println(jogador1);
				}				
			}
		}		
		
		sc.close();
	}

}
