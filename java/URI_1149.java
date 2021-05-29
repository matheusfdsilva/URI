package URI;
import java.util.Scanner;

public class URI_1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int soma = 0; int cont = 0;
		
		while(n <= 0) {
			n = sc.nextInt();
		}
		
		for(int i = m; cont < n; i++) {
			soma += i;
			cont += 1;
		}
		
		System.out.println(soma);
		
		
		
		sc.close();

	}

}
