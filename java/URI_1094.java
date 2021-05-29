package URI;
import java.util.Scanner;

public class URI_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totCoelho = 0, totRato = 0, totSapo = 0;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int qtde = sc.nextInt();
			char animal = sc.next().charAt(0);
			if(animal == 'S') {
				totSapo += 1 * qtde;
			}
			else if(animal == 'R') {
				totRato += 1 * qtde;
			}
			else {
				totCoelho += 1 * qtde;
			}
		}
		int cobaias = totSapo + totRato + totCoelho;
		System.out.println("Total: " + cobaias + " cobaias");
		System.out.println("Total de coelhos: " + totCoelho);
		System.out.println("Total de ratos: " + totRato);
		System.out.println("Total de sapos: " + totSapo);
		
		double percentualCoelho = (double) totCoelho / cobaias * 100;
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelho );
		double percentualRato = (double) totRato / cobaias * 100;
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualRato );		
		double percentualSapo = (double) totSapo / cobaias * 100;
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapo );		
		
		sc.close();

	}

}
