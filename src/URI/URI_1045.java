package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1045 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
						
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double n1, n2, n3;
		
		if(a > b && a > c) {
			n1 = a;
			if(b > c) {
				n2 = b;
				n3 = c;
			}
			else {
				n2 = c;
				n3 = b;
			}			
		}
		else if(b > c) {
			n1 = b;
			if(a > c) {
				n2 = a;
				n3 = c;
			}
			else {
				n2 = c;
				n3 = a;
			}
		}
		else {
			n1 = c;
			if(a > b) {
				n2 = a;
				n3 = b;
			}
			else {
				n2 = b;
				n3 = a;
			}
		}
		
		if(n1 >= n2 + n3) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if(n1 * n1 == n2 * n2 + n3 * n3) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if(n1 * n1 > n2 * n2 + n3 * n3) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if(n1 * n1 < n2 * n2 + n3 * n3) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		
		if(n1 == n2 && n1 == n3) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		
		else if(n1 == n2 || n2 == n3 || n1 == n3) {
			System.out.println("TRIANGULO ISOSCELES");			
		}
			
		sc.close();

	}

}
