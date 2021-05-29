package URI;
import java.util.Scanner;

public class URI_2059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		int r = sc.nextInt();
		int a = sc.nextInt();
		
		int soma = j1 + j2;
		
		if (r == 0 && a == 1 || r == 1 && a == 0) {
			System.out.println("Jogador 1 ganha!");
		}
		else if (r == 1 && a == 1) {
			System.out.println("Jogador 2 ganha!");
		}
		else if (soma % 2 == 0 && p == 1 || soma % 2 != 0 && p == 0) {
			System.out.println("Jogador 1 ganha!");
		}		
		else {
			System.out.println("Jogador 2 ganha!");
		}
		
		sc.close();

	}

}
