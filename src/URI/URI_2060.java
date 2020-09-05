package URI;
import java.util.Scanner;

public class URI_2060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int multiplo2 = 0, multiplo3 = 0, multiplo4 = 0, multiplo5 = 0;

		for (int i=0; i<n; i++) {
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
				multiplo2++;
			}
			if (numero % 3 == 0) {
				multiplo3++;
			}
			if (numero % 4 == 0) {
				multiplo4++;
			}
			if (numero % 5 == 0) {
				multiplo5++;
			}
		}
		
		System.out.printf("%d Multiplo(s) de 2\n", multiplo2);
		System.out.printf("%d Multiplo(s) de 3\n", multiplo3);
		System.out.printf("%d Multiplo(s) de 4\n", multiplo4);
		System.out.printf("%d Multiplo(s) de 5\n", multiplo5);	
		
		sc.close();

	}

}
