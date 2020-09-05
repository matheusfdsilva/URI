package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1178 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[100];
		
		double n = sc.nextDouble();
		vect[0] = n;
		
		for (int i = 1; i < vect.length; i++) {
			n = n / 2;
			vect[i] = n;			
		}
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("N[%d] = %.4f\n", i, vect[i]);
		}
		sc.close();

	}

}
