package URI;
import java.util.Scanner;

public class URI_2344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota = sc.nextInt();
		char conceito;
		
		if (nota == 0) {
			conceito = 'E';
		} else if (nota < 36) {
			conceito = 'D';
		} else if (nota < 61) {
			conceito = 'C';
		} else if (nota < 86) {
			conceito = 'B';
		} else {
			conceito = 'A';
		}
		
		System.out.println(conceito);
		
		sc.close();
	}

}
