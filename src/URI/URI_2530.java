package URI;

import java.util.Scanner;

public class URI_2530 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] juan = new int[n];	
			int[] ricard = new int[m];
			for (int i = 0; i < n; i++) {
				juan[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				ricard[i] = sc.nextInt();
			}
			
			boolean vaiZerar = checkNotas(juan, ricard);
			System.out.println(vaiZerar ? "sim" : "nao");			
		}		
		
		sc.close();
	}

	private static boolean checkNotas(int[] juan, int[] ricard) {
		int aux = 0;
		int nota = ricard[aux];
		for (int i = 0; i < juan.length; i++) {
			if (juan[i] == nota) {
				aux++;
				if (aux < ricard.length) {
					nota = ricard[aux];
				}				
			}			
		}
		return aux == ricard.length;
	}
}
