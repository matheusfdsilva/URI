package URI;

import java.util.Scanner;

public class URI_3170 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int g = sc.nextInt();
				
		int avgGalhos = g / 2;
		int lefts = avgGalhos - b;
		
		System.out.println(lefts <= 0 ? "Amelia tem todas bolinhas!" : "Faltam " + lefts + " bolinha(s)");
		
		
		sc.close();
	}	
}
