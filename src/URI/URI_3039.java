package URI;

import java.util.Scanner;

public class URI_3039 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int carrinho = 0, bonecas = 0;
		
		for (int i = 0; i < n; i++) {
			String nome = sc.next();
			String sexo = sc.next();
			if (sexo.equals("F")) bonecas++;
			else carrinho ++;
		}
		
		System.out.println(carrinho + " carrinhos");
		System.out.println(bonecas + " bonecas");		
		
		sc.close();
	}
}
