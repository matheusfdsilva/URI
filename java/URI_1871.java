package URI;

import java.util.Scanner;

public class URI_1871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();	
		
		while (M != 0 && N != 0) {
			int soma = M + N;
			
			String string = "" + soma;
			String newString = "";
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) != '0') {
					newString += string.charAt(i);
				}
			}
			System.out.println(newString);
			
			M = sc.nextInt();
			N = sc.nextInt();	
		}
		
		sc.close();	

	}

}
