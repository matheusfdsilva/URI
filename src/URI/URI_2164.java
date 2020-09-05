package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_2164 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double fibo = (Math.pow(((1 + Math.sqrt(5)) / 2), n)
				- Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5);
		
		System.out.printf("%.1f\n", fibo);
		
		sc.close();

	}

}
