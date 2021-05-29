package URI;

import java.util.Scanner;

public class URI_1557 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aux, aux2;		
		int n = sc.nextInt();
		
		while(n != 0) {				
			int[][]m = new int[n][n];
			int maior = m[0][0];
			
			aux = 1;
			for (int l = 0; l < n; l++) {
				for (int c = 0 ; c < n; c++) {					
					m[l][c] = aux;
					if(m[l][c] > maior) {
						maior = m[l][c];
					}
					
					if(n > 1) {
						aux2 = m[0][n-2];
						if(c < n - 1) {
							aux *= 2;
						}else {
							aux /= aux2;							
						}
					}						
				}
				
			}
			String t = Integer.toString(maior);
			String stringFormat = "%" + t.length() + "d";
        	for (int l = 0; l < n; l++) {
        		for (int c = 0; c < n; c++) {  			

                    System.out.printf(stringFormat, m[l][c]);
                    if (c < n - 1) System.out.print(" ");
                    else System.out.println();
        		}
        	}    
    		System.out.println();
			n = sc.nextInt();
		}			
		
		sc.close();

	}

}
