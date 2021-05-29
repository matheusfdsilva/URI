package URI;

import java.util.Scanner;

public class URI_1375 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			String[] grid = new String[n];
			boolean isPossible = true;
			
			for (int i = 0; i < n; i++) {
				String numeroCarro = sc.next();
				int ultrapassagens = sc.nextInt();				
				int posicaoAntiga = i + ultrapassagens;
				
				if (isPossible && (posicaoAntiga < 0 || posicaoAntiga >= n || grid[posicaoAntiga] != null)) {
					isPossible = false;					
				}
				else if (isPossible){					
					grid[posicaoAntiga] = numeroCarro;  
				}
			}	
			
			System.out.println(isPossible ? String.join(" ", grid) : -1);
			
			n = sc.nextInt();
		}		
		
		sc.close();
	}
}