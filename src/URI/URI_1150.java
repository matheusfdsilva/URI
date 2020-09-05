package URI;
import java.util.Scanner;

public class URI_1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int z = sc.nextInt();
		int cont = 0; int soma = 0;
		
		while(z <= x) {
			z = sc.nextInt();
		}
		
		while(soma < z) {
			soma += x;
			cont += 1;
			x += 1;
		}
		
		System.out.println(cont);
		
		sc.close();

	}

}
