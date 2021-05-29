package URI;

import java.util.Scanner;

public class URI_1542 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		
		while (q != 0) {
			int d = sc.nextInt();
			int p = sc.nextInt();
			
			int pages = p * q * d / (p - q);
			if (pages > 1) System.out.println(pages + " paginas");
			else System.out.println(pages + " pagina");
			
			q = sc.nextInt();	
		}
		
		sc.close();
	}
}