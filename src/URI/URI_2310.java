package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2310 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contSaques = 0, contBloqueio = 0, contAtaque = 0;
		int sucessSaques = 0, sucessBloqueio = 0, sucessAtaque = 0;
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			String jogador = sc.next();
			int tSaque = sc.nextInt();
			contSaques += tSaque;
			int tBloqueio = sc.nextInt();
			contBloqueio += tBloqueio;
			int tAtaque = sc.nextInt();
			contAtaque += tAtaque;
			int sSaque = sc.nextInt();
			sucessSaques += sSaque;
			int sBloqueio = sc.nextInt();
			sucessBloqueio += sBloqueio;
			int sAtaque = sc.nextInt();
			sucessAtaque += sAtaque;				
		}
		
		double perSaque = sucessSaques * 100.0 / contSaques;
		System.out.printf("Pontos de Saque: %.2f %%.\n", perSaque);
		double perBloqueio =  sucessBloqueio * 100.0 / contBloqueio;
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n", perBloqueio);
		double perAtaque =  sucessAtaque * 100.0 / contAtaque;
		System.out.printf("Pontos de Ataque: %.2f %%.\n", perAtaque);
		
		sc.close();

	}

}
