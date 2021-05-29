package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1985 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			int codigo = sc.nextInt();
			int quantidade = sc.nextInt();
			
			switch (codigo) {
			case 1001:
				soma += quantidade * 1.50;
				break;
			case 1002:
				soma += quantidade * 2.50;
				break;
			case 1003:
				soma += quantidade * 3.50;
				break;
			case 1004:
				soma += quantidade * 4.50;
				break;
			case 1005:
				soma += quantidade * 5.50;
				break;
			}
		}		
		System.out.printf("%.2f\n", soma);		
		
		sc.close();
	}
	
}
