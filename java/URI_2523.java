package URI;
import java.util.Scanner;

public class URI_2523 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String letras = sc.next();
			
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				int posicao = sc.nextInt();
				
				System.out.print(letras.substring(posicao - 1, posicao));	
				if (i == n - 1) {
					System.out.println();
				}
			}			
		}		
		
		sc.close();

	}

}
