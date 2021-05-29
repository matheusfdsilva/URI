package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2533 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int somaNota = 0;
			int somaCarga = 0;
			for (int i = 0; i < num; i++) {
				int nota = sc.nextInt();
				int carga = sc.nextInt();
				somaNota += nota * carga;
				somaCarga += carga;
			}
			double ira = somaNota / (somaCarga * 100.0);
			System.out.printf("%.4f\n", ira);
			
		}
		
		sc.close();
	}
}