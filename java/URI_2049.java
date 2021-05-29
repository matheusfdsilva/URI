package URI;

import java.util.Scanner;

public class URI_2049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int instancia = 1;
		
		while (!n.equals("0")) {
			if (instancia > 1) System.out.println();			
			String str = sc.next();
			String situacao = "falsa";
			if (str.contains(n)) {
				situacao = "verdadeira";
			}
			System.out.println("Instancia " + instancia);
			System.out.println(situacao);
			instancia++;
			n = sc.next();
		}		
		
		sc.close();
	}
}