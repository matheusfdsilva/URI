package URI;
import java.util.Scanner;

public class URI_1961 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alturaPulo = sc.nextInt();
		int canos = sc.nextInt();
		
		int[]alturaCano = new int[canos];
		int cont = 0;
		
		for (int i = 0; i < canos; i++) {
			alturaCano[i] = sc.nextInt();			
		}	
		
		for (int i = 0; i < (canos - 1); i ++) {
			if (Math.abs(alturaCano[i] - alturaCano[i + 1]) <= alturaPulo) {
				cont++;
			} 		
		}
		
		if (cont == canos - 1) {
			System.out.println("YOU WIN");
		} else {
			System.out.println("GAME OVER");
		}
		
		sc.close();
	}

}
