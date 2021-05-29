package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtde;
		double price, pagar;
		
		pagar = 0;		
		for(int i = 1 ; i <= 2; i++) {
			codigo = sc.nextInt();
			qtde = sc.nextInt();
			price = sc.nextDouble();
			pagar += price * qtde;
		}
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
		
		sc.close();

	}

}
