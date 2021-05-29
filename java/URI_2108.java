package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2108 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		List<String> strings = new ArrayList<>();		
		
		while (!frase.equals("0")) {			
			String[]aux = frase.split(" ");
			
			for (int i = 0; i < aux.length; i++) {
				strings.add(aux[i]);
				System.out.print(aux[i].length());
				if (i < aux.length-1) System.out.print("-");
				else System.out.println();
			}
			
			frase = sc.nextLine();			
		}
		
		System.out.println();
		System.out.println("The biggest word: " + biggestWord(strings));		
		
		sc.close();
	}
	
	static String biggestWord(List<String> x) {
		String biggest = x.get(0);		
		for (String obj : x) {
			if (obj.length() >= biggest.length()) {
				biggest = obj;
			}
		}		
		return biggest;		
	}
}
