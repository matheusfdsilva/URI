package URI;

import java.util.Scanner;

public class URI_3142 {
	
	public static final String LETTER = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			String str = sc.next();
			int coluna = 0;
			
			if (str.length() == 1) {
				coluna = LETTER.indexOf(str);
			}
			else if (str.length() == 2){
				coluna = LETTER.indexOf(str.charAt(0)) * 26 + LETTER.indexOf(str.charAt(1));						
			}
			else {
				coluna = LETTER.indexOf(str.charAt(0)) * 676 + LETTER.indexOf(str.charAt(1)) * 26 + LETTER.indexOf(str.charAt(2));
			}
			
			if (coluna > 16384 || str.length() > 3) {
				System.out.println("Essa coluna nao existe Tobias!");
			}
			else {
				System.out.println(coluna);
			}			
		}		
		
		sc.close();
	}
}