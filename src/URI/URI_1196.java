package URI;

import java.util.Scanner;

public class URI_1196 {
		
	private static String ST = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String wrongString = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			
			for (char ch : wrongString.toCharArray()) {
				if (ch == ' ') sb.append(" ");
				else sb.append(ST.charAt(ST.indexOf(ch) - 1));
			}
			
			System.out.println(sb.toString());			
								
		}		
		
		sc.close();
	}
}
