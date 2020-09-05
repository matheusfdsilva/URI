package URI;

import java.util.Scanner;

public class URI_2180 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int peso = sc.nextInt();
		int contPrimos = 0, velocidade = 0;
		
		for (int i = peso; contPrimos < 10; i++) {
			
			int totDiv = 0;
			
			for (int p = 1; p <= i; p++) {
				if (i % p == 0) {
					totDiv++;
				}
			}
			if (totDiv == 2) {				
				contPrimos++;
				velocidade += i;
			}
		}
		int tempoViagemHoras = 60000000 / velocidade;
		int tempoViagemDias = tempoViagemHoras / 24;
		
		System.out.println(velocidade + " km/h");
		System.out.println(tempoViagemHoras + " h / " + tempoViagemDias + " d");	
		
		sc.close();
	}
}
