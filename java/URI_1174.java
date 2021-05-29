package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1174 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double [] vect = new double[100];
		
		for (int i = 0; i < vect.length; i++) {
			double n = sc.nextDouble();
			vect[i] = n;
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, vect[i]);
			}
		}
		
		
		
		
		
		sc.close();

	}

}
