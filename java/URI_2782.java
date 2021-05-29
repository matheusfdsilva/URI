package URI;

import java.util.Scanner;

public class URI_2782 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]vect = new int[n];			
		
		for (int i = 0; i < n ; i++) {
			vect[i] = sc.nextInt();							
		}
				
		int escadinhas = 0;
		int dif = 0;		
		for (int i = 1; i < vect.length; i++) {		
			if (i > 1 && vect[i] - vect[i-1] != dif) {			
				escadinhas++;				
			}
			dif = vect[i] - vect[i-1];
		}
				
		System.out.println(escadinhas + 1);
				
		sc.close();
	}
}