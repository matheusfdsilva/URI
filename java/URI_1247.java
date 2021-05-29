package URI;

import java.util.Scanner;

public class URI_1247 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int d = sc.nextInt();
			int vf = sc.nextInt();
			int vg = sc.nextInt();
			
			double distanciaG = Math.sqrt(144 + d * d);			
			double tempoF = (double) 12 / vf;
			double tempoG = (double) distanciaG / vg;
			
			if (tempoG <= tempoF) System.out.println("S");
			else System.out.println("N");
			
		}		
		
		sc.close();
	}
}
