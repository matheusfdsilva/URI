package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double fixsalary, totvendas, salario;
		
		String name = sc.next();
		fixsalary = sc.nextDouble();
		totvendas = sc.nextDouble();
		
		salario = fixsalary + totvendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		
		
		sc.close();

	}

}
