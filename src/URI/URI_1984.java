package URI;

import java.util.Scanner;

public class URI_1984 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String numero = sc.next();
		String newNumero = "";
		
		for (int i = numero.length() - 1; i >= 0; i--) {
			char aux = numero.charAt(i);
			newNumero += aux;
		}
		
		System.out.println(newNumero);		
		
		sc.close();
	}

}
