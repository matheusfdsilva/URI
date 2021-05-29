package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1958 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		System.out.printf("%+.4E\n", n);		
		
		sc.close();
	}
}
