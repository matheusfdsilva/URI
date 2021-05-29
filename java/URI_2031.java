package URI;
import java.util.Scanner;

public class URI_2031 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String jogador1 = sc.next();
			String jogador2 = sc.next();
			
			if (jogador1.equals("ataque")) {
				if (jogador2.equals("pedra") || jogador2.equals("papel")) {
					System.out.println("Jogador 1 venceu");
				}
				else {
					System.out.println("Aniquilacao mutua");
				}
				
			} else if (jogador1.equals("pedra")) {				
				if (jogador2.equals("pedra")) {
					System.out.println("Sem ganhador");
				} else if (jogador2.equals("papel")) {
					System.out.println("Jogador 1 venceu");
				} else {
					System.out.println("Jogador 2 venceu");
				}
				
			} else {
				if (jogador2.equals("pedra") || jogador2.equals("ataque")) {
					System.out.println("Jogador 2 venceu");					
				} else {
					System.out.println("Ambos venceram");
				} 
			}
		}
		
		sc.close();
	}

}
