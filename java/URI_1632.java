package URI;

import java.util.Scanner;

public class URI_1632 {

	private static String letters = "aAeEiIoOSs";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int variacoes = 1;
			String str = sc.next();
			for (char ch : str.toCharArray()) {
				variacoes = (letters.contains(ch+"") ? variacoes * 3 : variacoes * 2);
			}
			
			System.out.println(variacoes);
		}		
		
		sc.close();		
	}
}