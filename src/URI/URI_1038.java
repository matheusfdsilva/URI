package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double preco;		
		int codigo = sc.nextInt();
		int qtde = sc.nextInt();
		
		switch(codigo) {
		case 1:
			preco = qtde * 4.00;
			break;
		case 2:
			preco = qtde * 4.50;
			break;
		case 3:
			preco = qtde * 5.00;
			break;
		case 4:
			preco = qtde * 2.00;
			break;
		case 5:
			preco = qtde * 1.50;
			break;	
		default:
			preco = 0.0;
		}
		
		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();
		

	}

}
