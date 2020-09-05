package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_2234 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int p = sc.nextInt();
		
		double media = (double) h / p;
		System.out.printf("%.2f\n", media);		
		
		sc.close();

	}

}
