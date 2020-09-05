package URI;

import java.util.Scanner;

public class URI_2152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int H = sc.nextInt();
			int M = sc.nextInt();
			int O = sc.nextInt();
			
			String auxHoras;				
			if (H < 10) {
				auxHoras = "0" + H;
			} else {
				auxHoras = "" + H;
			}					
			String auxMinutos;			
			if (M < 10) {
				auxMinutos = "0" + M;
			} else {
				auxMinutos = "" + M;
			}
			
			if (O == 1) {
				System.out.println(auxHoras + ":" + auxMinutos + " - A porta abriu!");
			} else {
				System.out.println(auxHoras + ":" + auxMinutos + " - A porta fechou!");
			}
		}		
		
		sc.close();
	}

}
