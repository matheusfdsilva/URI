package URI;

import java.util.Scanner;

public class URI_2984 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
						
		while (sb.indexOf(")") != -1) {
			int indexOpen = sb.indexOf("(");
			int indexClose = sb.indexOf(")");
			if (indexOpen >= 0 && indexOpen < indexClose) {
				sb.deleteCharAt(indexOpen);
				sb.deleteCharAt(indexClose-1);
			}
			else if (indexOpen == -1 || indexOpen > indexClose) {
				sb.deleteCharAt(indexClose);
			}			
		}
				
		int pendingIssues = sb.length();
				
		System.out.println(pendingIssues == 0 ? "Partiu RU!" : "Ainda temos " + pendingIssues + " assunto(s) pendente(s)!");
		sc.close();
		
	}
}