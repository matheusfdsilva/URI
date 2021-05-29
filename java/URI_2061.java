package URI;
import java.util.Scanner;

public class URI_2061 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int abas = n;
		
		for (int i = 0; i < m; i++) {
			String acao = sc.next();
			
			if (acao.equals("fechou")) {
				abas++;				
			} else {
				abas--;
			}
		}
		
		System.out.println(abas);
		
		sc.close();

	}

}
