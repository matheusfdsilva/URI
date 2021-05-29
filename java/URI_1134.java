package URI;
import java.util.Scanner;

public class URI_1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totAlc = 0; int totGa = 0; int totDie = 0;
		int tipo;
		
		do {
			tipo = sc.nextInt();
			while(tipo > 4 || tipo < 1) {
				tipo = sc.nextInt();
			}
			if(tipo == 1) {
				totAlc += 1;
			}
			else if(tipo == 2) {
				totGa += 1;
			}
			else if(tipo == 3) {
				totDie += 1;
			}
		}while(tipo != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + totAlc);
		System.out.println("Gasolina: " + totGa);
		System.out.println("Diesel: " + totDie);		
		
		sc.close();

	}

}
