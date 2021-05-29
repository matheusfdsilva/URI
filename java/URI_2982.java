package URI;

import java.util.Scanner;

public class URI_2982 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int gasto = 0, verba = 0;
		
		for (int i = 0; i < n; i++) {
			char t = sc.next().charAt(0);
			int c = sc.nextInt();
			
			if (t == 'G') gasto += c;
			else verba += c;			
		}		
		if (gasto > verba) System.out.println("NAO VAI TER CORTE, VAI TER LUTA!");
		else System.out.println("A greve vai parar.");
		
		sc.close();
	}
}
