package URI;

import java.util.Scanner;

public class URI_2417 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pontosC = 0;
		int pontosF = 0;
		
		pontosC += sc.nextInt() * 3;
		pontosC += sc.nextInt();
		int saldoC = sc.nextInt();
		
		pontosF += sc.nextInt() * 3;
		pontosF += sc.nextInt();
		int saldoF = sc.nextInt();
				
		if (pontosC == pontosF && saldoC == saldoF) {
			System.out.println("=");
		}
		else if (pontosC == pontosF && saldoC > saldoF || pontosC > pontosF) {
			System.out.println("C");			
		}
		else {
			System.out.println("F");
		}
		
		sc.close();
	}
}