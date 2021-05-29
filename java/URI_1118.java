package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int resp;
		
		do {
			double nota1 = sc.nextDouble();
			while(nota1 < 0 || nota1 > 10) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}
			double nota2 = sc.nextDouble();
			while(nota2 < 0 || nota2 > 10) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}
			double media = (nota1 + nota2) / 2;
			System.out.printf("media = %.2f\n", media);			
			
			System.out.println("novo calculo (1-sim 2-nao)");
			resp = sc.nextInt();	
			while(resp != 1 && resp != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				resp = sc.nextInt();				
			}
		} while(resp == 1);			
		
		sc.close();

	}

}
