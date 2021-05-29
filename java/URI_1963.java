package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1963 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double percentage = b * 100 / a - 100;
		System.out.printf("%.2f%%\n", percentage);	
		
		sc.close();
	}

}
