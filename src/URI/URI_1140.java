package URI;

import java.util.Scanner;

public class URI_1140 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
					
		while (!frase.equals("*")) {
			
			String[] tauto = frase.split(" ");
			if (isTautograma(tauto)) System.out.println("Y");
			else System.out.println("N");
			
			frase = sc.nextLine();
		}	
		
		sc.close();
	}
	
	public static boolean isTautograma(String[] x) {
		boolean status = false;
		if (x.length == 1) return status = true; // se for apenas uma palavra ela tbm é considerada um tautograma
		
		for (int i = 1; i < x.length; i++) {
			if (x[i].substring(0,1).equalsIgnoreCase(x[i-1].substring(0,1))) status = true;
			else return status = false;
		}
		return status;
	}
}
