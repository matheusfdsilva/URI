package URI;

import java.util.Scanner;

public class URI_2143 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			for (int i = 0; i < n; i++) {
				int pessoas = sc.nextInt();
				int pedidos = 0;
				
				if((pessoas - 2) % 2 == 0) pedidos = (pessoas - 2) * 2 + 2;
				else pedidos = (pessoas - 1) * 2 + 1;
				System.out.println(pedidos);
			}
			n = sc.nextInt();
		}
		
		
		sc.close();
	}
}
