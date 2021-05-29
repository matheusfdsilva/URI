package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, DELTA, X1, X2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		DELTA = B * B - 4 * A * C;
		if(DELTA < 0 || A == 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			X1 = (- B + Math.sqrt(DELTA)) / (2 * A);
			X2 = (- B - Math.sqrt(DELTA)) / (2 * A);
			System.out.printf("R1 = %.5f%n", X1);
			System.out.printf("R2 = %.5f%n", X2);			
		}	
		
		sc.close();
	}
}
