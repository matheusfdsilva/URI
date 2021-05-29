package URI;
import java.util.Scanner;

public class URI_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testes = sc.nextInt();
		
		for (int i = 0; i < testes; i ++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int cont = 0;
			int soma = 0;
			for(int t = x; cont < y; t++) {
				if(t % 2 != 0) {
					soma += t;
					cont += 1;					
				}
			}
			System.out.println(soma);
		}
		
		
		sc.close();

	}

}
