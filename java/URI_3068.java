package URI;

import java.util.Scanner;

public class URI_3068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int teste = 1;
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();		
		
		while (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
			int m = sc.nextInt();
			int meteoritos = 0;
			
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if (x >= x1 && x <= x2 && y <= y1 && y >= y2) {
					meteoritos++;
				}
			}
			System.out.println("Teste");
			System.out.println(teste);
			System.out.println(meteoritos);			
			teste++;	
			
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
		}		
		
		sc.close();
	}
}
