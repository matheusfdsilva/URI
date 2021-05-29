package URI;

import java.util.Scanner;

public class URI_2651 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		String string = sc.next();
		
		if (string.toLowerCase().contains("zelda")){
			System.out.println("Link Bolado");
		} else System.out.println("Link Tranquilo");
		
		sc.close();

	}
}
