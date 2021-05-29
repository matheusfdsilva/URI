package URI;

import java.util.Scanner;

public class URI_2708 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String moviment = sc.next();		
		int totOut = 0, totBack = 0, jeepOut = 0, jeepBack = 0;
		
		while (!moviment.equals("ABEND")) {
			int p = sc.nextInt();
			
			if (moviment.equals("SALIDA")) {
				totOut += p;
				jeepOut++;
			}
			else {
				totBack += p;
				jeepBack++;
			}			
			moviment = sc.next();			
		}
		
		System.out.println(totOut - totBack);
		System.out.println(jeepOut - jeepBack);		
		
		sc.close();
	}
}
