package URI;
import java.util.Scanner;

public class URI_1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();		
		
		for (int i = 0; i < x; i++) {
			int n = sc.nextInt();
			int soma = 0;			
		
			for(int t = 1; t < n; t++) {
				if (n % t == 0) {
					soma += t;						
				}				
			}			
			if(soma == n) {
				System.out.println(n + " eh perfeito");
			} 
			else {			
				System.out.println(n + " nao eh perfeito");
			}			
			
		}						
		
		sc.close();

	}

}
