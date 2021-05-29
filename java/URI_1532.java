package URI;

import java.util.Scanner;

public class URI_1532 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int v = sc.nextInt();
		
		while (n != 0 || v != 0) {				
			boolean acertou = checkJumps(n, v);
			while (!acertou && v > 0) {					
				acertou = checkJumps(n, v--);
			}
						
			System.out.println(acertou ? "possivel" : "impossivel");
			
			n = sc.nextInt();
			v = sc.nextInt();
		}		
		
		sc.close();
	}

	private static boolean checkJumps(int n, int v) {
		int aux = 0;
		while (v != 0) {
			for (int i = 0; i < v; i++) {
				aux+=v;
				if (aux == n) {
					return true;
				}				
			}
			v--;
		}
		return false;
	}
}