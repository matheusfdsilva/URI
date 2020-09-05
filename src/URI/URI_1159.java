package URI;
import java.util.Scanner;

public class URI_1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n != 0) {
			int soma = 0;
			int cont = 0;
			for (int i = n; cont < 5; i++) {
				if (i % 2 == 0) {
					soma += i;
					cont += 1;
				}
			}
			System.out.println(soma);
			n = sc.nextInt();
		}			
		
		sc.close();

	}

}
