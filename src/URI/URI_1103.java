package URI;

import java.util.Scanner;

public class URI_1103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		
		while (h1 != 0 || m1 != 0 || h2 != 0 || m2 != 0) {			
			int tempoSono;
			
			if (h1 == h2 && m1 == m2) tempoSono = 24 * 60;
			else if (h2 < h1) tempoSono = (24 - h1) * 60 + h2 * 60 + (m2 - m1);
			else if (h1 == h2 && m2 < m1) tempoSono = 24 * 60 - (m1 - m2);			
			else tempoSono = (h2 - h1) * 60 + (m2 - m1);		
			
			System.out.println(tempoSono);
			
			h1 = sc.nextInt();
			m1 = sc.nextInt();
			h2 = sc.nextInt();
			m2 = sc.nextInt();			
		}		
		
		sc.close();
	}
}
