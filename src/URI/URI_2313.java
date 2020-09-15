package URI;

import java.util.Scanner;

public class URI_2313 {

	public static boolean isTriangle = false;
	public static String isRectangle = "Retangulo: N";
	public static String type = null;
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();	
		
		if(a > Math.abs(b-c) && a < b + c || b > Math.abs(a-c) && b < a + c || c > Math.abs(b-a) && c < a + b) {
			isTriangle = true;
			if (a != b && a != c && b != c) {
				type = "Valido-Escaleno";
			}
			else if(a == b && a == c) {
				type = "Valido-Equilatero";
			}
			else {
				type = "Valido-Isoceles";
			}
			if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
				isRectangle = "Retangulo: S";
			}
			System.out.println(type);
			System.out.println(isRectangle);
		}
		else {
			type = "Invalido";
			System.out.println(type);
		}		
		
		
		sc.close();
	}
}