package URI;

import java.util.Scanner;

public class URI_3139 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		int[]vect = new int[30];
		for (int i = 0; i < 30; i++) {
			vect[i] = sc.nextInt();
		}		
		
		int days = 0, aux = 0;
		
		while (n <= m) {	
			int media = 0;
			
			for (int i = 0; i < vect.length; i++) {
				media += vect[i];
			}			
			int subscribers = (int) Math.ceil(media / 30.0);			
			vect[aux] = subscribers;		
			n += subscribers;
			days++;
			aux++;
			if (aux == 30) aux = 0;
		}
		
		
		System.out.println(days);
		
		sc.close();
	}	
}
