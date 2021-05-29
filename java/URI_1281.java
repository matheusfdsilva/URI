package URI;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class URI_1281 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			Map<String, Double> produtos = new HashMap<>();
			for (int l = 0 ; l < x; l++) {
				String item = sc.next();
				double preco = sc.nextDouble();
				produtos.put(item, preco);
			}
			int a = sc.nextInt();
			double conta = 0;
			for (int l = 0; l < a; l++) {
				String lista = sc.next();
				int qtde = sc.nextInt();
				if (produtos.containsKey(lista)) {
					conta += qtde * produtos.get(lista);					
				}				
			}
			System.out.printf("R$ %.2f\n", conta);			
		}		
		
		sc.close();
	}
}
