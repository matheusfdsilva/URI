package URI;

import java.util.Scanner;

public class URI_1271 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int genome = 1;
		
		while (n != 0) {
			int[] list = new int[n+1];
			for (int i = 0; i <= n; i++) {
				list[i] = i;
			}
			
			int r = sc.nextInt();
			for (int i = 0; i < r; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int cont = 0;
				int turns = b - a + 1;
				for (@SuppressWarnings("unused")
				int k = 0; cont < turns; a++, b--, cont+=2) {
					int aux = list[a];
					list[a] = list[b];
					list[b] = aux;					
				}				
			}				
							
			int q = sc.nextInt();
			System.out.println("Genome " + genome);
			
			for (int i = 0; i < q; i++) {
				int qi = sc.nextInt();
				for (int k = 0; k < list.length; k++) {
					if (list[k] == qi) {
						System.out.println(k);
						break;
					}
				}				
			}		
						
			n = sc.nextInt();
			genome++;
		}				
		
		sc.close();
	}
}