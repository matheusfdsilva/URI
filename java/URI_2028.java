package URI;

import java.util.Scanner;

public class URI_2028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caso = 1;
		
		while (sc.hasNext()) {							
			int n = sc.nextInt();				
			StringBuilder sb = new StringBuilder();
			sb.append(0+" ");
			int aux = 1;
			int totNumeros = 1;
			
			while (aux <= n) {
				totNumeros = appendNumeros(sb, aux, totNumeros);
				aux++;
			}
			
			String numero = sb.length() == 2 ? "numero" : "numeros";
						
			System.out.println("Caso " + caso + ": " + totNumeros + " " + numero);
			System.out.println(sb.toString().trim());	
			System.out.println();
						
			caso++;
		}	
		
		sc.close();
	}

	private static int appendNumeros(StringBuilder sb, int n, int numeros) {	
		int tot = numeros;
		for (int i = 0; i < n; i++) {
			sb.insert(sb.length(), n+" ");
			tot++;
		}		
		return tot;
	}
}