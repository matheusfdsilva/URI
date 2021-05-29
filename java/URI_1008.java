package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, horas;
		double valorhra, salary;
		
		n = sc.nextInt();
		horas = sc.nextInt();
		valorhra = sc.nextDouble();
		salary = valorhra * horas;
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		
		
		
		sc.close();
	}

}
