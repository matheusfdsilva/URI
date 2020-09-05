package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoViagem = sc.nextInt();
		int veloMedia = sc.nextInt();
		
		double litros = veloMedia * tempoViagem / 12.0;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();

	}

}
