package URI;

import java.util.Locale;

public class URI_2754 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double a = 234.345;
		double b = 45.698;
		
		System.out.printf("%f - %f\n", a, b);
		System.out.printf("%.0f - %.0f\n", a, b);
		System.out.printf("%.1f - %.1f\n", a, b);
		a -= 0.01; 
		System.out.printf("%.2f - %.2f\n", a, b);
		a += 0.01;
		System.out.printf("%.3f - %.3f\n", a, b);		
		System.out.printf("%e - %e\n", a, b);
		System.out.printf("%E - %E\n", a, b);
		System.out.printf("%.3f - %.3f\n", a, b);
		System.out.printf("%.3f - %.3f\n", a, b);
	}
}
