package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2863 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();			
			double[] vect = new double[n];
			
			for (int i = 0; i < n; i++) {
				double t = sc.nextDouble();
				vect[i] = t;
			}
			double record = maisRapido(vect);
			System.out.printf("%.2f\n", record);
		}			
		
		sc.close();

	}
	public static double maisRapido(double[]vect) {
		double maisRapido = vect[0];
		for (double d : vect) {
			if (d < maisRapido) maisRapido = d;
		}
		return maisRapido;
	}
}
