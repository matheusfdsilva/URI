package URI;

import java.util.Scanner;

public class URI_2765 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		String[] frases = frase.split(",");
		for (String string : frases) {
			System.out.println(string);
		}
		
		sc.close();
	}
}
