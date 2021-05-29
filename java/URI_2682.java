package URI;

import java.util.Scanner;

public class URI_2682 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean valida = true;
		int temp = 1;
		int aux = 0;		
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (temp == 1) {
				aux = n;
			}
			else if (valida) {				
				if (n > aux) {
					aux = n;
				} 
				else {
					valida = false;
				}				
			}			
			temp++;			
		}
		
		System.out.println(aux+1);
		
		sc.close();
	}
}