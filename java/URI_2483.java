package URI;
import java.util.Scanner;

public class URI_2483 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		String frase = "Feliz nat";
		
		for (int i = 1; i <= n; i++) {
			frase += "a";
			
			if (i == n) {
				frase += "l!";
			}
		}
		
		System.out.println(frase);
		sc.close();
	}

}
