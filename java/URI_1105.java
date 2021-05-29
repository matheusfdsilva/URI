package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1105 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		List<Integer> bancos = new ArrayList<>();
		int reserva, bancoDev, bancoCred, valorDeb;
		
		while (b != 0 && n != 0) {						
			for (int i = 0; i < b; i++) {
				reserva = sc.nextInt();
				bancos.add(reserva);				
			}
								
			for (int i = 0; i < n; i++) {
				bancoDev = sc.nextInt();
				bancoCred = sc.nextInt();
				valorDeb = sc.nextInt();				
				bancos.set(bancoDev-1, bancos.get(bancoDev-1) - valorDeb);
				bancos.set(bancoCred-1, bancos.get(bancoCred-1) + valorDeb);				
			}
			
			Integer saldo = bancos.stream().filter(x -> x < 0).findFirst().orElse(null);
			
			System.out.println(saldo == null ? "S" : "N");
			
			b = sc.nextInt();
			n = sc.nextInt();
			bancos.clear();
		}		
		
		sc.close();
	}	
}