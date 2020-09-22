package URI;

import java.util.Scanner;

public class URI_1300 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			int graus = sc.nextInt();		
			int resto = graus % 6;
			
			System.out.println(resto == 0 ? "Y" : "N");			
		}
		
		sc.close();

	}
}