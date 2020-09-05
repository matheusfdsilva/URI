package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		int totpositivo = 0;
		
		for(int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			if(n > 0) {
				totpositivo += 1;
				sum += n;
			}			
		}
		System.out.println(totpositivo + " valores positivos");
		double media = sum / totpositivo;
		System.out.printf("%.1f%n", media);
		
		sc.close();

	}

}
