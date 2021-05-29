package URI;

import java.util.Scanner;

public class URI_3053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		char posicao = sc.next().charAt(0);
		
		for (int i = 0; i < n; i++) {			
			int movimento = sc.nextInt();
			if (posicao == 'A') {
				if (movimento == 1) posicao = 'B';
				else if (movimento == 3) posicao = 'C';				
			}
			else if (posicao == 'B') {
				if (movimento == 1) posicao = 'A';
				else if (movimento == 2) posicao = 'C';
			}
			else {
				if (movimento == 2) posicao = 'B';
				else if (movimento == 3) posicao = 'A';
			}
		}		
		System.out.println(posicao);		
		
		sc.close();
	}
}
