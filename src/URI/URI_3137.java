package URI;

import java.util.Scanner;

public class URI_3137 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pagina = sc.nextInt();
		int totDigitos = 0;
		int temp = 100000;
		
		while (pagina > 0) {		
			int result = pagina - temp + 1; // + 1 pq devemos considerar o primeiro numero para fazer a contagem tb na hora de calcular o totDigitos... ex: (20 - 10 = 10), mas na verdade era pra ser 11 já que o primeiro conta, contando de 10 a 20
			if (result > 0) {								
				String valueOf = String.valueOf(temp);
				totDigitos += result * valueOf.length();
				pagina -= result;
			}
			temp /= 10;
		}		
		
		System.out.println(totDigitos);				
		
		sc.close();
	}
}