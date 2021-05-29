package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		double ir;
		
		if(renda > 4500.0) {
			ir = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;
		}
		else if(renda > 3000.0) {
			ir = 1000* 0.08 + (renda - 3000.0) * 0.18;
		}
		else if(renda > 2000) {
			ir = (renda - 2000) * 0.08;
		}
		else {
			ir = 0;
		}
		
		if(ir == 0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", ir);
		}	
				
		sc.close();

	}

}
