package URI;

import java.util.Scanner;

public class URI_1627 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int at, ad, bt, bd;
		
		for (int i = 0; i < n; i++) {
			at = sc.nextInt();
			ad = sc.nextInt();
			bt = sc.nextInt();
			bd = sc.nextInt();
						
			int hp = sc.nextInt();				
			String turn = null;
			int aux = 0;
			
			while(hp > 0) {
				if (aux >= 0 && aux % ad == 0) {
					hp -= at;
					turn = "Andre";
				}
				if (aux >= 0 && hp > 0 && aux % bd == 0) {
					hp -= bt;
					turn = "Beto";
				}	
				aux++;
			}
			
			System.out.println(turn);		
		}		
		
		sc.close();
	}
}